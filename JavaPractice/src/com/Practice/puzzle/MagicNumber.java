package com.Practice.puzzle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MagicNumber {
	
	public static int power(int a, int b){
		int power = 1;
		
		while(b > 0){
			power = power * a;
			b--;
		}
		
		return power;
	}
	
	public static void printNumber(int n){
		
		List<Integer> list = new ArrayList<Integer>();
		double sum = 0;
				int i = 0;
		
		do{
			i++;
			list.add(n % 2);
			n = n / 2;
			
		}while( n != 0 );
		
		Iterator<Integer> itr = list.iterator();
		i = 1;
		while( itr.hasNext()){
			//System.out.println("Power "+power(5, i));
			int num = itr.next();
			//System.out.println("n = "+num);
			sum = (power(5, i) * num) + sum;
			i++;
			//System.out.println("sum = "+i+" "+sum);
		}
		System.out.println("Number is "+sum);
	}
	
	public static void main(String args[]){
		printNumber(2);
	}

}
