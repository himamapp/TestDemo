package datadriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class reCallingMethods extends TestBaseLogin{



		@Test
		public void OpenmyURL() throws IOException
		{
			BaseLogin();
			System.out.println("MobileLoginHomeLoan");	
			driver.get("url");
			
		}
}



