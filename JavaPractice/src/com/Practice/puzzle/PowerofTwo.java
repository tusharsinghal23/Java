package com.Practice.puzzle;

public class PowerofTwo {

	public static void main(String args[]){
		
		int num = 128;
		if((~num & 1) == 1)
			System.out.println("Number is divided by 2");
		else
			System.out.println("Number is not divided by 2");
		
	}
}
