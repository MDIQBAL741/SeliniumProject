package com.mphasis.selenium1.SeleniumDemo1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupsTestDemo3 {
  @Test (groups = {"fe"})
  public void b() {
	  assertEquals(2,2);
  }
  @Test(groups = {"be"})
  public void a() {
	 
		  assertEquals(2,2);
	  
  }
  @Test(groups = {"be","fe"})
  public void a1() {
	 
		  assertEquals(2,2);
}
  @Test(groups = {"functional"})
  public void a2() {
	 
		  assertEquals(2,2);
}
}