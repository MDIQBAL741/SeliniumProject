package com.mphasis.selenium1.SeleniumDemo1;

import org.testng.annotations.Test;

import com.mphasis.selenium1.listner.MyListener;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import javax.swing.event.DocumentListener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class ListenerTestDemo {
  @Test
  public void f() {
	  AssertJUnit.assertTrue(true);
  }
  @Test
  public void f1() {
	  AssertJUnit.assertTrue(false);
  }
  @Test
  public void f2() {
	  AssertJUnit.assertTrue(true);
  }
}
