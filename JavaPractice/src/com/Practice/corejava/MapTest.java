package com.Practice.corejava;

import java.util.HashMap;
import java.util.Map;

class MapTest{
	public static void main(String args[]){
		
		Map map = new HashMap();
		
		map.put("1",123);
		
		map.put("1",1235);
		
		System.out.println(map.get("1"));
	}
}
