package com.Practice.stringexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracesMatcher {
	
	public static boolean matchWithStackClass(String str){
		
		Stack<Character> stack = new Stack<Character>();
		
		for( int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == '}' && stack.empty())
				return false;
			
			if(str.charAt(i) == '{')
				stack.push('{');
			else if(str.charAt(i) == '}')
				stack.pop();
		}
	return true;
   }
	
	public static boolean matchWithoutStackClass(String str){
		
		List<Character> list = new ArrayList<Character>();
		for( int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == '}' && list.size() == 0)
				return false;

			if(str.charAt(i) == '{')
				list.add('{');
			else if(str.charAt(i) == '}')
				list.remove(list.size()-1);
					
		}
	return true;
	}
	
	public static void main(String args[]){
		System.out.println(matchWithoutStackClass("{{hello}{}}"));
		System.out.println(matchWithoutStackClass("}}}"));
		System.out.println(matchWithStackClass("{{hello}{}}"));
		System.out.println(matchWithStackClass("}}}"));
		
	}

}
