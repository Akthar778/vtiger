package ExtendRepotPractice;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreatingExtendReport {
	public static void main(String[] args) {
		ExtentReports extendreport= new ExtentReports();
		ExtentSparkReporter extendsparkreport= new ExtentSparkReporter("./extentReport/akthar4.html");
	    extendreport.attachReporter(extendsparkreport);
	    
	    ExtentTest testnamehere = extendreport.createTest("this is the test name 1");
	    testnamehere.log(Status.PASS,"akthar message hello, fixed issue");
	    
	    extendreport.flush();
	    
	    try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
