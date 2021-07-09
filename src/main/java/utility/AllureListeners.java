package utility;

import com.facebook.test.BaseProgram;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class AllureListeners  extends BaseProgram implements ITestListener {
    CaptureScreenshot screenshot = new CaptureScreenshot();
    // When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult Result)
    {
        System.out.println("The name of the testcase failed is :"+Result.getName());
        screenshot.Screenshot(Result.getName(), "failed");
    }

    @Override
    public void onTestSuccess(ITestResult Result)
    {
        System.out.println("The name of the testcase passed is :"+Result.getName());
        screenshot.Screenshot(Result.getName(),"Success");
    }
}
