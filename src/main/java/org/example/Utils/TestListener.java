package org.example.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.EclipseInterface;

public class TestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {  // კონკრეტული ტესტის დასტარტვისას
        String testName = result.getMethod().getMethodName(); // რეპორტი
        ExtentReportManager.createTest(testName); // შექმნას პირველი ტესტის ჩანაწერი და სახელი რა ქონდეს
        ExtentReportManager.getTest().info("Test Started: " + testName); // ამით გამოგვაქვს ტესტის სტატუსი, ამ შემთხვევაშ Info

//        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().pass("Test Passed: " + result.getName() );  // წარმატებული
//        System.out.println("Test Passed: " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        ExtentReportManager.getTest().fail("Test Failed: " + result.getThrowable());  // დავაფეილოთ, .geThrowable იმისთვის რომ დაფეილების მიზეზი გამოიტანოს რეპორტში
    }

    @Override
    public void onTestSkipped(ITestResult result) {
         ExtentReportManager.getTest().skip("Test Skipped: " + result.getName());  // დავსკიპოთ

    }

    @Override
    public void onStart(ITestContext context) {  // როდესაც სუიტი ისტარტება

    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentReportManager.flushReports(); // რეპორტი დავხუროთ.

    }
}

//1.07



