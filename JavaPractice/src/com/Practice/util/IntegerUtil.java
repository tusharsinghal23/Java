package com.Practice.util;

public class IntegerUtil {
	
	public static int fact(int num){
		if(num == 0)
			return 1;
		return num * fact(num - 1 );
	}

	public static int getMax(int a, int b){
		if( a > b)
			return a;
		else
			return b;
	}
	
	public static int getFibonacci(int num){
		
		int temp, firstnum = 0, secondnum = 1, next = 0;
		
		if( num == 0)
			return firstnum;
		else if(num == 1)
			return secondnum;
		
        for( int i = 2 ; i <= num ; i++){
 
        	next = firstnum + secondnum;
        	firstnum = secondnum;
        	secondnum = next;
        }
        
        return next;
		
	}
	
	public static int sqrt(int x){
		int i = 1;
		while(true){
			int temp = i * i;
			if( temp < x)
				i++;
			else if(temp == x)
				return i;
			else
				return -1;
		}
	}
	
	public static double findSquareRoot(double number)
    {
		if( number < 0)
			return -1;
		else if(number == 0)
			return 0;
		
       double rootvalue = 1.0;
        
       for( int i = 0 ; i < number ; i++)
    	   rootvalue = .5 * (rootvalue + number/rootvalue);
       
       return rootvalue;
        
    }

	public static void main(String args[]){
		System.out.println(findSquareRoot(36.0));
	}
	
}
