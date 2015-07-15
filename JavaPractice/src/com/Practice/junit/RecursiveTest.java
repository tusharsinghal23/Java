package com.Practice.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Practice.stringexercise.RecursiveStringRemoval;

public class RecursiveTest {

	@Test
	public void test() {
		assertEquals("abde", RecursiveStringRemoval.removeRecursive("abcde", 'c'));
	}

}
