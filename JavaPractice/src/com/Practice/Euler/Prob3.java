package com.Practice.Euler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Prob3 {
	
	public static int nextPrime(int n){
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = true;

		
		for( int i = 2 ; i < n ; i++){
			Iterator<Integer> it = list.iterator();
			
			while(it.hasNext()){
				if(i % it.next() == 0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				list.add(i);
			}
		}
		
		int temp = n+1;
		
		while(true){
			flag = true;
			Iterator<Integer> iterator = list.iterator();
		   while( iterator.hasNext()){
			   if(temp % iterator.next() == 0){
				   flag = false;
				   break;
			   }
		   }
		   if(flag == true ){
			   return temp;
		   }
		   else
			   temp++;
		}
		
	}
	
    public static int getPrimeFactor(long num){
    	Set<Integer> lt = new TreeSet<Integer>();
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for( int i = 2 ; i <= num ; i++){
    		if( num % i == 0){
    			System.out.println("Num " + num +" i= "+i);
    			list.add(i);
    			lt.add(i);
    			num = num /i;
    			i--;
    		}
    }
    	return list.get(list.size()-1);
  	
    }
	
	public static int getLargestPrimeFactor(long num){
		int lprime = 2;
		int temp = 0;
		boolean flag = true;
		List<Integer> lt = new ArrayList<Integer>();
		lt.add(2);
		
		if(num == 1)
			return 1;
		
		
		while(!(num == 1)){
			System.out.println(num);
			
			if(num % lprime == 0)
				num = num / lprime;
			else {
			temp = lprime + 1;
			
			while( num % lprime != 0 && lprime < num){
				flag = true;
				Iterator<Integer> it = lt.iterator();
				while(it.hasNext()){
					if( temp % it.next() == 0){
						flag = false;
						break;
					}
				}
				
				if(flag == true){
					lprime = temp;
					lt.add(lprime);
				}
				else
					temp++;
			}
			
			if(num % lprime == 0 )
				num = num / lprime;
		
    	}	
	}
		return lprime;
	}
	
	public static void main(String args[]){
		//600851475143L
		System.out.println("Value is = "+Prob3.getLargestPrimeFactor(42));
		System.out.println("Value is = "+Prob3.getPrimeFactor(600851475143L));

	}
}
