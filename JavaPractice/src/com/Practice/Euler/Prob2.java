package com.Practice.Euler;

public class Prob2 {

	public static long evenFibonacci(int limit){
		long sum = 2;
		long fibfirst = 1;
		long fibsecond = 2;
		long temp = 0;
		
		if( limit == 1)
			return 0;
		else if(limit == 2)
			return sum;
		
		while(true){
			temp = fibfirst + fibsecond;
			if(temp <= limit && (temp % 2) == 0)
				sum = sum + temp;
			else if(temp > limit)
				break; 
			fibfirst = fibsecond;
			fibsecond = temp;
		}
		
		return sum;
	}
}
