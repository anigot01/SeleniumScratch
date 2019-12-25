package com.testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsInTestNG {
	
	@Test
	public void test()
	{
		System.out.println("This is Test");
		Assert.assertTrue(false);
	}
	
	@Test(groups={"Sanity"})
	public void test1()
	{
		System.out.println("This is Sanity");
	}
	
	@Test(groups={"Sanity","Regression"})
	public void test2()
	{
		System.out.println("This is Sanity and Regression");
	}

}
