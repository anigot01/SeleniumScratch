package com.testNG;



import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	@Test(groups={"Sanity"})
	@Parameters({"UserName"})
	public void test(@Optional("default") String UserName)
	{
		System.out.println(UserName);
		
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
