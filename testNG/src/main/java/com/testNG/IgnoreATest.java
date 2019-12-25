package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreATest {
	
	
	
	@Test(enabled = false)
	public void test1()
	{
		System.out.println("This is Disabled");
	}
	
	@Test(groups={"Sanity","Regression"})
	public void test2()
	{
		System.out.println("This is Enabled");
	}

}
