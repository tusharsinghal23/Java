package com.Practice.puzzle;

import java.util.HashMap;
import java.util.Map;

import com.Practice.util.Logger;

public class ItrinaryEx {
	
	private static Logger log = Logger.getInstance(ItrinaryEx.class.getName());
	
	public static String printMyItinary(Map<String,String> itrMap){
		
		String start = "";
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String > entry : itrMap.entrySet()){
		    if(!itrMap.containsValue(entry.getKey())){
		    	start = entry.getKey();
		    	log.debug(start);
		    	break;
		    }
		}
		
		String to = itrMap.get(start);
	    sb.append(start);
	    
	    while(to != null){
	    	sb.append(" --> "+to);
	    	start = to;
	    	to = itrMap.get(start);
	    }	    
		return sb.toString();
	
	}
		
	
	
	public static String printGeekItinary(Map<String,String> itrMap){
		
		String start = "";
		StringBuilder sb = new StringBuilder();
		Map<String,String> revMap = new HashMap<String,String>();
	
		for(Map.Entry<String, String > entry : itrMap.entrySet()){
			revMap.put(entry.getValue(), entry.getKey());	
		}
		
		for(Map.Entry<String, String > entry : itrMap.entrySet()){
		    if(!revMap.containsKey(entry.getKey())){
		    	start = entry.getKey();
		    	break;
		    }
		}
		
	    String to = itrMap.get(start);
	    sb.append(start);
	    
	    while(to != null){
	    	sb.append(" --> "+to);
	    	start = to;
	    	to = itrMap.get(start);
	    }	    
		return sb.toString();
	}
	
	public static void main(String args[]){
		Map<String,String> locMap = new HashMap<String,String>();
		locMap.put("Chennai", "Bangalore");
		locMap.put("Bombay", "Delhi");
		locMap.put("Goa", "Chennai");
		locMap.put("Delhi", "Goa");
		
		System.out.println(printGeekItinary(locMap));
		System.out.println(printMyItinary(locMap));
		
	}

}
