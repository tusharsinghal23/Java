package com.Practice.stringexercise;

public class StringSplit {
	
	public static void split(String str, String ch){
		
		String myStr[] = str.split(ch);
		
		for( int i = 0; i < myStr.length ; i++)
		System.out.println(myStr[i]);
		
	}
	
	public static void main(String args[]){
		
		split( "Tushar,Singhal,awesome,programmer","," );
		
	}


}
