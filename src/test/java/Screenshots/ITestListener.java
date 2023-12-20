package Screenshots;

import org.testng.ITestResult;

public class ITestListener extends BaseTests implements org.testng.ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        screenshotCapture(result.getName() + ".jpg");
    }
}
