package com.mphasis.selenium1.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
@Override
public void onStart(ITestContext context) {
	System.out.println("on start");
	}
@Override
public void onFinish(ITestContext context) {
	ITestListener.super.onFinish(context);
	System.out.println("on finish");
	System.out.println(context.getName());
	
}
@Override
public void onTestFailure(ITestResult result) {
	ITestListener.super.onTestFailure(result);
	System.out.println("on test failure");
	System.out.println(result.toString());
}
@Override
public void onTestSuccess(ITestResult Result) {
	ITestListener.super.onTestSuccess(Result);
	System.out.println("on test success");
}
}
