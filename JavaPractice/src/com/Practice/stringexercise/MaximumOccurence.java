package com.Practice.stringexercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MaximumOccurence {
	
	public static Character getMaxCharacter(String str){
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for( int i = 0 ; i < str.length() ; i++){
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i),1);
		}
		
		int count = 0;
		Character maxChar = null;
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if( entry.getValue() > count){
            	maxChar = entry.getKey();
            	count = entry.getValue();
            }  	
		}
	  return maxChar;
	}
	
	public static String removeDuplicate(String str){
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i = 0 ; i < str.length() ; i++)
			set.add(str.charAt(i));
		
		Iterator<Character> itr = set.iterator();
	    StringBuilder sb = new StringBuilder();
		
		while(itr.hasNext()){
			sb.append(itr.next());			
		}
		
		return sb.toString();
	}
	
	public static void main(String args[]){
		System.out.println(MaximumOccurence.getMaxCharacter("ABCC SD wd s ss     "));
		System.out.println(removeDuplicate("GeeksforGeeks"));
	}
}
