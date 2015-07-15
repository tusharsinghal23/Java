package com.Practice.stringexercise;

import java.util.Scanner;

public class ScannerSpilt {
	
	public static void main(String args[]){
       Scanner sc = new Scanner("This is Tushar");
		
		while(sc.hasNext()){
			System.out.println(sc.next());
	}
  }
}
