package com.Practice.util;

public class ArrayUtil {

	public static void rotateArray(int[] arr, int num){
		int temp = 0;
		num = num % arr.length;
		for( int i = 0 ; i < num ; i++ ){
			temp = arr[0];
			for( int j = 0 ; j < arr.length -1  ; j++)
				arr[j] = arr[j+1];
		
			arr[arr.length - 1 ] = temp;
		}
	}
	
	public static void reverseArray(int[] arr){
		for( int  i = 0 ; i < arr.length /2 ; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - (i+1)];
			arr[arr.length - (i+1)] = temp;
		}
	}
	
	public static Boolean isArraySorted(int[] arr){
		
		if(arr.length == 0)
			return false;
		
	     for(int  i = 0 ; i < arr.length - 1 ; i++)
	    	 if(arr[i] > arr[i+1])
	    		 return false;
	    	 
	    	 return true;
	    	 
		} 
		
	public static void showArray(int[] ob, String msg){
		
		System.out.print("Array ["+msg+"] = ");
		for(int o : ob){
			System.out.print(" "+o);
		}
		System.out.println();
	}
	
	public static void showArray(int[] ob){
		
		System.out.print("Array = ");
		for(int o : ob){
			System.out.print(" "+o);
		}
		System.out.println();
	}
	
	public static Boolean searchArray(int arr[], int key){
		for( int i = 0 ; i < arr.length ; i++){
			if(key == arr[i])
				return true;
		}
		return false;
	}
	
	public static void arraySort(){
		
	}
	
	public static void main(String args[]){
		int[] arr = {2,3,4,5,6,7};
		int[] arr2 = {3,2,5,6};
		System.out.println(ArrayUtil.isArraySorted(arr));
		System.out.println(ArrayUtil.isArraySorted(arr2));
		showArray(arr);
		reverseArray(arr);
		showArray(arr);;
		rotateArray(arr, arr.length);
		showArray(arr);
	}

}
