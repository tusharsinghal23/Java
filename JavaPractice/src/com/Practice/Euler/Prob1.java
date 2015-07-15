package com.Practice.Euler;

import com.Practice.util.*;

public class Prob1 {
	
	public static int returnSum(int limit){
		int sum = 0;
		
		for( int i = 1 ; i < limit ; i++ ){
			if( (i % 3) == 0 || ( i % 5) == 0){
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String args[]){
		String s = "hello";
		s.matches("[A-Z]{5}[0-9]{5}[A-Z]");
		
		System.out.println(returnSum(1000));
		System.out.println(Prob2.evenFibonacci(4000000));
		System.out.println(IntegerUtil.getFibonacci(4));
	}

}
