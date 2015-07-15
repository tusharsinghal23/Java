package com.Practice.junit;

import com.Practice.*;
import com.Practice.puzzle.FibonacciSeries;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		
		
		assertEquals(true,FibonacciSeries.checkSeries("TuuT"));
	}

}
