package com.Practice.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;




import com.Practice.corejava.SwapPojo;
import com.Practice.corejava.SwapWithOutTempVariable;

public class SwapTest {

	@Test
	public void test() {
		
		int a = 12;
		int b = 13;
	    assertEquals(b, SwapWithOutTempVariable.swap(new SwapPojo(a, b)).getA());
	    assertEquals(a, SwapWithOutTempVariable.swap(new SwapPojo(a, b)).getB());
	    
	}

}
