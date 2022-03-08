package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReporterOutputDemo {
  @Test
  
  public void testLoginDhouldBeSuccessful() {
	Reporter.log("Opening Login pages");
	assertEquals("login success", "login success");
	Reporter.log("Login successful");
	
		}
		 @Test
		 public void testRegistrationShouldBeSuccessful() {
			 Reporter.log("Opening Registration page");
			 assertEquals("regn sucess", "regn sucess");
			 Reporter.log("Registration successful");
		 }
	  
  }

