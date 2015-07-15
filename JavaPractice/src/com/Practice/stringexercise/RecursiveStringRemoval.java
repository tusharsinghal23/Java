package com.Practice.stringexercise;

public class RecursiveStringRemoval {
	
	/**
	 *  Three points to remember
	 *  indexof() subString() 
	 *  To convert StringBuilder to String use 
	 *  sb.tostring();
	 **/
	
	StringBuilder sb = new StringBuilder();

	public void stringRemove(String str, int i, char ch){
		
		if(i < (str.length())){
		   	if( str.charAt(i) != ch )
		   			sb.append(str.charAt(i));
		    i++;
		    stringRemove(str, i, ch);
		   
		  }
    }

	public static String removeRecursive(String word, char ch){
		int index = word.indexOf(ch); 
		
		if(index == -1) 
			return word;
	     
		return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch); 
	}
	
	
	
}

 