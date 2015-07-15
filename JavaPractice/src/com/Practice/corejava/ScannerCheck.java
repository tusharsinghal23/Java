package com.Practice.corejava;

import java.util.Scanner;

public class ScannerCheck {

	public static void main(String args[]){
		
		int sum = 0 ;
		
		Scanner sc = new Scanner(System.in);
			
		int itr = sc.nextInt();
						
		for( int i = 0 ; i < itr ; i++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			sum = sum + a + b + c;
		}
		
		System.out.println("sum = "+sum);
	}
}
