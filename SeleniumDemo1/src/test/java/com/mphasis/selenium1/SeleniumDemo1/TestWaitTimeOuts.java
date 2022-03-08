package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWaitTimeOuts {
	private WebDriver driver;
	private String url;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://the-internet.herokuapp.com/dynamic_loading/1";
		driver.navigate().to(url);
		
		
	}	
    @Test
    public void shouldTitleMatch() throws InterruptedException
    { 	
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
		ele.click();
		
		
		WebDriverWait waitdriver = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitdriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
		
		WebElement eleText = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
		assertEquals(eleText.getText(), "Hello World!");
		Thread.sleep(2000);
    }
    @AfterMethod
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}