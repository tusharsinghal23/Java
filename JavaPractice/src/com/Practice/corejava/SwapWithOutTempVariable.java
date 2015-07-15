package com.Practice.corejava;

public class SwapWithOutTempVariable {
	
	public static SwapPojo swap(SwapPojo swap){
		int a = swap.getA();
		int b = swap.getB();
		
		b = a + b;
		a = b - a;
		b = b - a;
		
		swap.setA(a);
		swap.setB(b);
		
		return swap;
	}

}
