package com.Practice.arraypuzzle;

public class ArraySingleIteration {
	
	public static void countarrayusingArray(int arr[]){
		
		int temp[] = new int[arr.length];
		
		for( int i = 0 ; i < temp.length ; i++ )
			temp[i] = 0;
		
		for( int i = 0 ; i < arr.length ; i++ )
		   temp[arr[i]-1] = temp[arr[i]-1] + 1;
			
		for( int i = 0 ; i < temp.length ; i++)
			System.out.println((i + 1) + " --> " + temp[i]);
	}
	
	
	public static void countarraySingle( int arr[]){
		
		int i = 0;
		
		while( i < arr.length ){
			
			if(arr[i] < 0 )
				i++;
			else{
				int elementindex = arr[i] - 1;
			
				if( arr[elementindex] > 0 ){
					arr[i] = arr[elementindex];
					arr[elementindex] = -1;
					
				}else{
					arr[elementindex] = arr[elementindex] - 1;
					arr[i] = 0;
					i++;
                }
			}		
			
		}
		
		System.out.println("----------");
		
		for( i = 0 ; i < arr.length ; i++)
			System.out.println((i + 1) + " --> " + (-arr[i]));
		
	}
	
	public static void main(String args[]){
		int arr[] = {2,1,3,2,4};
		countarrayusingArray(arr);
		countarraySingle(arr);
	}

}

