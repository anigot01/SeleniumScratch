package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTestNG {
	
	
	@Test
	public void test()
	{
		System.out.println("This is Test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"test"})
	public void test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test(dependsOnMethods= {"test1"})
	public void test2()
	{
		System.out.println("This is Test2");
	}

}
