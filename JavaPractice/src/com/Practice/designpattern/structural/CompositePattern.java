package com.Practice.designpattern.structural;

import java.io.ObjectInputStream.GetField;

import com.Practice.util.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositePattern {
  
	String name;
	
	//This CompositePattern.class.getName() will return class name in static context
	int salary;
	List<CompositePattern> emp;
	
    public CompositePattern() {
    		
	}
    
    public CompositePattern(String name, int salary){
    	
    	this.name = name;
    	this.salary = salary;
    	emp = new ArrayList<CompositePattern>();
    }
    
    public void add(CompositePattern compositePattern){
       emp.add(compositePattern);	
    }
    
    public void remove(CompositePattern compositePattern){
    	emp.remove(compositePattern);
    }

    public int getSalary(){
    	return salary;
    }
    
    public List<CompositePattern> getSubordinateList(){
    	return emp;
    }
    
    public int getSubordinateNumber(){
       return emp.size();	
    }
      
    public static int calCompSalary(CompositePattern emp){
    	
    	Logger log = Logger.getInstance(CompositePattern.class.getName());
    	int cost = 0;
    	if(emp.getSubordinateNumber() != 0){
    		cost = emp.getSalary();
    		List<CompositePattern> empList = emp.getSubordinateList();
    		Iterator<CompositePattern> iterator = empList.iterator();
    		while(iterator.hasNext()){
    			
    			CompositePattern em = iterator.next();
    			log.debug(em);
    			cost = cost + calCompSalary(em);
    			log.debug("Total Salary: "+cost);
    		}
    	}
    	else
    		cost = emp.getSalary();
    	return cost;
    }
    
    public String toString(){
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("Emp name = ");
    	sb.append(name);
    	sb.append(" Emp Salary = ");
    	sb.append(salary);
    	return sb.toString();
    	
    }
    
	public static void main(String args[]){
		
		CompositePattern ceo = new CompositePattern("Tushar",1000000);
		CompositePattern manager = new CompositePattern("Shashank",500000);
		CompositePattern architect = new CompositePattern("Bijay",500000);
		CompositePattern dev_1 = new CompositePattern("Pritam",250000);
		CompositePattern dev_2 = new CompositePattern("Rahul",250000);
		
		ceo.add(manager);
		ceo.add(architect);
		manager.add(dev_1);
		manager.add(dev_2);
		
		System.out.println("Company Salary = "+CompositePattern.calCompSalary(ceo));
		
	}
	
}
