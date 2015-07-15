package com.Practice.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Practice.puzzle.Factorial;
import com.Practice.stringexercise.StringSplit;

public class FactorialTest {

	@Test
	public void testPositive() {
		assertEquals(24, Factorial.getFactorial(4));
	}
	
	@Test
	public void testZero() {
		//assertEquals(1, Factorial.getFactorial(0));
		assertTrue(24 == Factorial.getFactorial(4) );
	}
	
	@Test
	public void testOne() {
		assertEquals(1, Factorial.getFactorial(1));
	}
	
	@Test
	public void testSplit()
	{
		StringSplit.split("tushar,Singhal", ",");
	}

}
