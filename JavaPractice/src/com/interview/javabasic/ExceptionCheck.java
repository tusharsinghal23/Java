package com.interview.javabasic;

public class ExceptionCheck {
	
	public int doFinallyTest(){
		boolean catchFlag = false;
		try{
			
			
			catchFlag = false;
			return 0;
		}
		catch(ArrayIndexOutOfBoundsException ex){
			catchFlag = true;
		}
		finally{
			if(catchFlag != false)
				System.out.println("Exception Trown ");
			else
				System.out.println("Exception not Trown ");
		}
		
		return 1;
		
	}
	
	public static void main(String args[]){
		new ExceptionCheck().doFinallyTest();
	}

}
