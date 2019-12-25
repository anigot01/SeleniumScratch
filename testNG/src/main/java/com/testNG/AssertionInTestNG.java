package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {

	@Test
	public void test() {

		Assert.assertTrue(true);
	}
	
	@Test
	public void test1() {

		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {

		Assert.assertEquals("Test","Test");
	}
	
	@Test
	public void test3() {

		Assert.assertEquals("Test","Test1");
	}
	
	@Test
	public void test5() {

		Assert.assertTrue(false," Test Case Failed");
	}
	
	@Test
	public void test6() {

		Assert.assertFalse(false,"This is Expected");
	}
	
	@Test
	public void test7() {

		Assert.assertFalse(false,"This is Expected");
	}
	
	@Test
	public void test8() {

		Assert.assertNotEquals("Test", "Test1");
	}

}
