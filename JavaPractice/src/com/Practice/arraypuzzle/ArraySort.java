package com.Practice.arraypuzzle;

import com.Practice.util.ArrayUtil;

public class ArraySort {	

	public static void getSelectionSort(int arr[]){
		
		int temp, inner_Count = 0;
		for( int i = 0 ; i < arr.length ; i++){
			int key = i;
			for( int j = i+1 ; j < arr.length ; j++){
				if(arr[key] > arr[j]){
					key = j;
					inner_Count++;
					
				}
			}
			temp = arr[key];
			arr[key] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Count = "+inner_Count);
	}
	
    public static void getInsertionSort(int arr[]){
		int temp;
		
		for( int i = 0 ; i < arr.length ; i++){
			for( int j = i+1; j < arr.length && j > 0 ; j--){
				if( arr[j] < arr[j-1]){
				   temp = arr[j];
				   arr[j] = arr[j-1];
				   arr[j-1] = temp;
					
				}					
			}
		}
	}
	
	public static void getBubbleSort(int arr[]){
		
		int len = arr.length;
		int temp = 0;
		
		for( int i = 0 ; i < len ; i++)
			for( int j = i + 1 ; j < len ; j++){
				if( arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
	}
	
	
	public static void main(String args[]){
		int arr[] = {4,3,8,1,6,2};
		//getSelectionSort(arr);
		getInsertionSort(arr);
		ArrayUtil.showArray(arr);
	}

}
