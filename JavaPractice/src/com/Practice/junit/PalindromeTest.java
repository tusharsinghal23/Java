package com.Practice.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Practice.stringexercise.*;
import com.Practice.util.StringUtil;

public class PalindromeTest {

	@Test
	public void test() {
		assertEquals(true, new StringUtil().checkPalindrome("tut"));
	}

	@Test
	public void test2() {
		assertEquals(false, new StringUtil().checkPalindrome("tutu"));
	}

	@Test
	public void test3() {
		assertEquals(true, new StringUtil().checkPalindrome("tuut"));
	}
	
	@Test
	public void test4() {
		assertEquals(false, new StringUtil().checkPalindrome("2tutu2"));
	}


}
