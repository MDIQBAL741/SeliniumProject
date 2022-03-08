package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSeleniumGrid {
  RemoteWebDriver driver;
  String baseURL, nodeURL;
  @BeforeMethod
  public void setUp()
  {
	  baseURL = "http://www.techgatha.com";
		nodeURL = "http://localhost:4444";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		driver = new RemoteWebDriver(capabilities);
  }
	@Test
  public void f() {
		driver.navigate().to(baseURL);
		  String title = driver.getTitle();
		  assertEquals(title, "TechGatha - Best IT Training Providers");
  }
	@AfterMethod
	public void cleanUp()
	{
		driver.close();
	}	
}
