package com.Practice.corejava;

public class CloneTest implements Cloneable {
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
	    System.out.println("We are Cloning");
		return super.clone();	
	}

	public static void main(String args[]) throws CloneNotSupportedException{
		
		CloneTest cloneTest = new CloneTest();
		
		cloneTest.setName("Obj 1");
		
		CloneTest cloneTest2 = (CloneTest)cloneTest.clone();
		
		System.out.println(cloneTest.getName()+" "+cloneTest.hashCode()+"Object Name :"+cloneTest);
		
		System.out.println(cloneTest2.getName()+" "+cloneTest2.hashCode());
		
		
	}

}
