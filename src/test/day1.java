package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {



	
	@Test
	public void PersonalLoanWeb()
	{
		System.out.println("PersonalLoanWeb");
		
	}
		
	@Test
	public void PersonalLoanLogin()
	{
		System.out.println("PersonalLoanLogin");
		Assert.assertTrue(false);
		
	}
		
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	

}
