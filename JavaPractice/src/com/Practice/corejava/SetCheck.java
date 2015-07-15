package com.Practice.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetCheck extends A {
	
	public static void main(String args[]){
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		Map<String, Integer> map2 = new TreeMap<String,Integer>();
		
		map.put("Tushar", 1);
		map.put("Singhal", 2);
		map.put("Tushar", 4);
		
		
		map2.put("A", 1);
		map2.put("B", 2);

		Set<String> str = new HashSet<String>();
		Set<String> str2 = new TreeSet<String>();
		
		str.add("Tushar");
		str.add("Tushar");
		str2.add("Singhal");
		
		System.out.println(new A() + " " + new SetCheck());
		System.out.println(str+"  "+map+ "  "+ map2+" "+str2);
		
	}

}

class A {
	public String toString(){
		return "A";
	}
}