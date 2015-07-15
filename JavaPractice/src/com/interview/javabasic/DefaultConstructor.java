package com.interview.javabasic;

public class DefaultConstructor {
	
	public DefaultConstructor(int n){
		System.out.println("Constructor n = "+n);
	}
	
	public static void main(String args[]){
		new DefaultConstructor(100);
	}

}
