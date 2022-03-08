package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    private String url;
    private String expectedTitle;
	
	@BeforeEach
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "http://www.google.com";
		expectedTitle = "Google";
		driver.navigate().to(url);
		
	}	
    @Test
    public void shouldTitleMatch()
    { 	
		String actualtitle = driver.getTitle();
		assertEquals(actualtitle, expectedTitle);
    }
    @AfterEach
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}