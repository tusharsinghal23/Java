package com.Practice.util;

import com.Practice.puzzle.Factorial;

/**
 * @author tushars5
 * 
 *  Singleton Pattern implemented here
 *
 */

public class Logger {
	
	private static final Logger log = new Logger(); 
	private static String logtext;
	private static boolean bit = true;
	private static boolean switchlogtext = true;
	
	private Logger(){}
	
	public static Logger getInstance(String text,boolean bit){		
		logtext = text;
		Logger.bit = bit; 
		return log;		
	}
	
	public static Logger getInstance(String text){		
		logtext = text;
		return log;		
	}
	
	public static void switchOn(){
		bit = true;
	}
	
	public static void switchOff(){
		bit = false;
	}
	
	public static void switchLogTextOff(){
		switchlogtext = false;
	}
	
	public static void switchLogTextOn(){
		switchlogtext = true;
	}
		
	public void debug(Object ob){
		
		if(bit != false){
			if(switchlogtext == true)
				System.out.println("["+logtext+"] "+ob.toString());
			else
				System.out.println(ob.toString());
		}
		
		
	}
	
	public static void main(String args[]){
		
		Logger log = Logger.getInstance("com.Practice.Logger");
		log.debug(new Factorial());
	}
	
	
}
