package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAdvanceuserInteraction {
	private WebDriver driver;
	private String url;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.techgatha.com/contact.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}@AfterMethod
	public void afterMethod() {
		driver.close();
	}
  @Test
  public void shouldColorAfterHoverBeAsExpected() throws InterruptedException {
	  WebElement ele = driver.findElement(By.id("name"));
		
		Actions builder = new Actions(driver);
		// will perform mouse over action
		Action seriesOfActions = builder.moveToElement(ele)
				.click()
				.pause(Duration.ofSeconds(2))
				.keyDown(ele, Keys.SHIFT)
				.sendKeys("shalini")
				.pause(Duration.ofSeconds(2))
				.keyUp(ele, Keys.SHIFT)
				.doubleClick(ele)
				.pause(Duration.ofSeconds(2))
				.contextClick()
				.pause(Duration.ofSeconds(2))
				.build();
		
		
		seriesOfActions.perform();
		driver.findElement(By.linkText("Copy")).click();
		
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.id("email"));
		builder.moveToElement(ele1)
		.click()
		.pause(Duration.ofSeconds(2))
		.keyDown(ele, Keys.CONTROL)
		.sendKeys("V")
		.pause(Duration.ofSeconds(2))
		.keyUp(ele, Keys.CONTROL)
		
		.pause(Duration.ofSeconds(2))
		.build().perform();

	 Thread.sleep(2000);
	 
	  }
}
