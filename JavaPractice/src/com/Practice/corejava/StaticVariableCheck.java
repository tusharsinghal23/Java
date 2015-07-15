package com.Practice.corejava;

public class StaticVariableCheck {
	
	static{
		i = 1;
	}
	
	static int i;
	
	public static void main(String args[]){
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr[i++][i++]);
		
		int j = 1;
		System.out.println(j++ +""+ j++);		
	}
}
