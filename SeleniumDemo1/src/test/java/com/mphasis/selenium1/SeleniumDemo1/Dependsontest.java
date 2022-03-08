package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Dependsontest {
  @Test 
  public void openBrowser() {
	  System.out.println("open the browser");
		  assertTrue(true);
  }
  @Test (dependsOnMethods = {"openBrowser"})
  public void signIn() {
	 
		  System.out.println("sign in");
	  
  }

}