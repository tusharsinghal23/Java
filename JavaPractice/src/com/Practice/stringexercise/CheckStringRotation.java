package com.Practice.stringexercise;

public class CheckStringRotation {
	
	public static boolean check(String str1, String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		int len = str1.length();
		int diff = 0;
		
		diff = str2.indexOf(str1.charAt(0));
		
		for( int i = 1 ; i < len ; i++ ){
			int temp = str2.indexOf(str1.charAt(i)) - i;
			
			if( str1.charAt(i) != str2.charAt( (i+ diff) % len))
				return false;
		}
		return true;
	}

	public static void main(String args[]){
		System.out.println(check("ABEACD", "DABAEC"));
	}
}
