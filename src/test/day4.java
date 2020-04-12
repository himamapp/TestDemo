package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day4 {



	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
		Assert.assertTrue(false);
		
	}
		
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");	
	}
	
	@Test(groups={"Smoke"})
	public void APNILoginHomeLoan()
	{
		System.out.println("APNILoginHomeLoan");
		
		
	}
		
	

}
