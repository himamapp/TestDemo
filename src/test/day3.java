package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class day3 {

	
	
	@org.testng.annotations.AfterClass(timeOut=4000)
	public void AfterClass()
	{
		System.out.println("After Class");
	}

	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	

	@Test(dataProvider="getData")
	public void TestNGparameterization(String username, String Password)
	{
		System.out.println("TestNGparameterization");
		System.out.println(username);
		System.out.println(Password);
		
	}
	
	
	
	@Test(groups={"Smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
		
	}
		
	@Test(enabled=false)
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");	
	}
	
	
	@Parameters({"URL"})
	@Test
	public void APNLoginHCarLoan(String urlname)
	{
		System.out.println("APNLoginCarLoan");
		System.out.println(urlname);
		
	}
	
	@Parameters({"URL", "APIkey/username", "HelloWorld"})
	@Test
	public void DoubleAPNLoginHCarLoan(String urlname, String key, String hello)
	{
		System.out.println("DoubleAPNLoginHCarLoan");
		System.out.println(urlname);
		System.out.println(key);
		System.out.println(hello);
		
	}
	
	
	@Test(dependsOnMethods= {"APNLoginHCarLoan"})
	public void WebAPNLoginHCarLoan()
	{
		System.out.println("WebAPNLoginHCarLoan");	
	}
	
	@org.testng.annotations.BeforeSuite 
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@DataProvider 
	public Object[][] getData()
	{
		//1st combination of username and password
		//2nd - user and password 
		//2rd - user name and passworth with no history
		Object[][] data= new Object[3][2]; 
		//First set of username and password
		
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetpassword";
		
		//second set of username and password
		
		data[1][0] = "firstsetusername";
		data[1][1] = "firstsetpassword";
		
		//3rd
		
		data[2][0] = "firstsetusername";
		data[2][1] = "firstsetpassword";
		return data;
	}
	
	
	
		
	

}
