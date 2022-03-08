package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PriorityTestDemo {
  @Test (priority=1, enabled=false)
  public void b() {
	  assertEquals(2,2);
  }
  @Test(priority=2)
  public void a() {
	 
		  assertEquals(2,2);
	  
  }
}
