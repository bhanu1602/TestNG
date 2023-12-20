package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        System.out.println("Test passed: " + result.id());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        System.out.println("Test failed: " + result.getStatus());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout");
        System.out.println("Test skipped: " + result.getEndMillis());

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart");
        System.out.println("All tests finished in the suite: " + context.getCurrentXmlTest());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        System.out.println("All tests finished in the suite: " + context.getName());
    }
}
