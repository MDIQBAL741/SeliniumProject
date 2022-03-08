package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScreenShot {
	private WebDriver driver;
	private String url;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.techgatha.com";
		driver.navigate().to(url);
	}@AfterMethod
	public void afterMethod() {
		driver.close();
	}
  @Test
  public void shouldColorAfterHoverBeAsExpected() throws InterruptedException, IOException {
	  WebElement ele = driver.findElement(By.partialLinkText("SER"));
		
		ele.click();
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		File srcfile = tks.getScreenshotAs(OutputType.FILE);
		File destFile = new File("ser.png");
		
		FileUtils.copyFile(srcfile, destFile);
		
		Thread.sleep(2000);
	 
	  }
}
