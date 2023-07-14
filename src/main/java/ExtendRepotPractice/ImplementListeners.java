package ExtendRepotPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ImplementListeners implements ITestListener {
    
	public void onTestStart(ITestResult result) {
		System.out.println("this test is start "+result.getName());
	}
	public void onTestSucess(ITestResult result) {
		System.out.println("this test is sucess "+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("this test is failure "+result.getName());
	}
	public void onStart(ITestResult result) {
		System.out.println("this test is onstart "+result.getName());
	}	
	public void onFinish(ITestResult result) {
		System.out.println("this test is onFinish "+result.getName());
	}

}
