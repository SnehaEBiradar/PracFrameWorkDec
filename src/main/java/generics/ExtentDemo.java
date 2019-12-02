package generics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentDemo {
	
	static ExtentReports report;
	static ExtentTest test;
	static ExtentHtmlReporter erep;
	
	public static void edata()
	{
		report=new ExtentReports();
		test=report.createTest("TestDemo");
		erep=new ExtentHtmlReporter("./reports/rep.html");
	}
}
