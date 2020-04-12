package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBaseLogin {

	public WebDriver driver = null;

	@Test
	public void BaseLogin() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/imam/eclipse-workspace/test-ng/src/datadriven/datadriven.properties");
		prop.load(fis);

		//System.out.println(prop.getProperty("username"));

		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/imam/Desktop/Selenium/geckodriver");

			driver = new FirefoxDriver();

		} else if (prop.getProperty("browser").equals("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "/Users/imam/Desktop/Selenium/chromedriver");
			driver = new ChromeDriver();

		} else {
			System.setProperty("webdriver.edge.driver", "/Users/imam/Desktop/Selenium/msedgedriver");
			driver = new EdgeDriver();

		}

		// driver.get(prop.getProperty("url"));

		// System.setProperty("webdriver.chrome.driver","/Users/imam/Desktop/Selenium/chromedriver");
		// WebDriver driver =new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver","/Users/imam/Desktop/Selenium/geckodriver");
		// WebDriver driver =new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver","/Users/imam/Desktop/Selenium/msedgedriver");
		// WebDriver driver =new EdgeDriver();

	}

}
