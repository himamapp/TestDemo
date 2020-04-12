package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day2 {


	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("I will execute first");
	}

	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I will execute before Method");
	}
	
	@AfterMethod
	public void AfterMothod()
	{
		System.out.println("I will execute after method");
	}
	

	
	
	@Test(groups={"Smoke"})
	public void Ploan()
	{
		System.out.println("ploan");
		
	}
		

		
	

}
