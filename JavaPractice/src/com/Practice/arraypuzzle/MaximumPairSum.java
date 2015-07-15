package com.Practice.arraypuzzle;

public class MaximumPairSum {
	
	public static int maxSum(int arr[]){
		
		if( arr.length < 2)
			return -1;
		
		int f_max = arr[0] > arr[1] ? 0 : 1; 
	    int s_max = arr[0] > arr[1] ? 1 : 0; 
		
	    for( int i = 2 ; i < arr.length ; i++){
			if( arr[i] > arr[f_max] ){
				s_max = f_max;
				f_max = i;
			}
			else if( arr[i] > arr[s_max])
				s_max = i;			
			
		}
		
	    return arr[f_max] + arr[s_max];
	}
	
	public static void main(String args[]){
		int arr[] = {11, 10, 8,10};
		System.out.println("Sum = "+maxSum(arr));
	}
}