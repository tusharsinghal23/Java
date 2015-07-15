package com.Practice.arraypuzzle;

public class ArrayReSize {
	
	private static int a[] = new int[6];
	
	public static void resize(){
		
		int arrLen = a.length * 4;
		
		int temp[] = new int[arrLen];
		
		a = temp;
	}
	
	public static void resize(int ntime){
		int arrLen = a.length * ntime;
		
		int temp[] = new int[arrLen];
		
		a = temp;
	}
	
	public static void main(String args[]){
				
		System.out.println(a.length);
		resize();
		System.out.println(a.length);
		
	}

}
