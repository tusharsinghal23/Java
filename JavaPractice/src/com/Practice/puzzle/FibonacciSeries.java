package com.Practice.puzzle;

public class FibonacciSeries {

	public static boolean checkSeries(String str){
		
		int n = str.length();
		
		for( int i = 0 ; i < n/2 ; i++){
			if( str.charAt(i) != str.charAt(n-i -1))
				return false;
		}
		return true;
	}
}
