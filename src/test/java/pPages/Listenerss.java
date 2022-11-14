package pPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import rResource.BaseS;
import rResource.ExtenTreport;

public class Listenerss extends BaseS implements ITestListener {

	public WebDriver driver;
	 ExtenTreport c=new ExtenTreport();
	 ExtentReports extend= c.RepoConfi();
	public ExtentTest test;
	ThreadLocal<ExtentTest> ExtentTest=new  ThreadLocal <ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestStart(result);
System.out.print("start");
 test= extend.createTest(result.getMethod().getMethodName());

 ExtentTest.set(test);
 ExtentTest.get().log(Status.INFO,"infore");
 
}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSuccess(result);
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		System.out.print("this test fail");
		String TestMethodName= result.getMethod().getMethodName();
		WebDriver driver =null;
		
		try {
		driver=(WebDriver)	result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				ExtentTest.get().addScreenCaptureFromPath(getScreenshot(TestMethodName , driver), result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onFinish(context);
	extend.flush();
	}

}
