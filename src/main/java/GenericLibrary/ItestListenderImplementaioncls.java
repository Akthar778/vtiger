package GenericLibrary;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ItestListenderImplementaioncls  implements ITestListener{
	
	ExtentReports report=new ExtentReports();;
	ExtentSparkReporter reporter=new ExtentSparkReporter("./extentReport/report1.html");
	public static ExtentTest Logger;
	public void onStart(ITestResult result) {
		report.attachReporter(reporter);
	}	
	public void onTestStart(ITestResult result) {
		Logger=report.createTest(result.getMethod().getMethodName());
	}
	public void onTestSucess(ITestResult result) {
		Logger.log(Status.PASS, "passed");
	}
	public void onTestFailure(ITestResult result) {
		Logger.log(Status.FAIL, "failed");
	}

	public void onFinish(ITestResult result) {
		report.flush();
	}
}
