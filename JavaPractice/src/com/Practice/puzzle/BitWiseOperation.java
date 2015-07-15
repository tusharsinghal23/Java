package com.Practice.puzzle;

public class BitWiseOperation {
	
	public static int multiplySevenByEight(int n){
		return n - ( n >> 3);
	}
	
	public static int multiplySixByEight(int n){
		return n - (2*( n >> 3));
	}
	
	public static void main(String args[]){
		System.out.println(multiplySevenByEight(24));
		System.out.println(multiplySixByEight(24));
	}

}
