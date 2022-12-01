package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utils;

import io.restassured.path.json.JsonPath;

public class BaseClass implements ITestListener {

	static ExtentReports extent;
	static ExtentTest test;
	private static Logger log = Logger.getLogger(BaseClass.class);

	@BeforeSuite
	public static void intializeReport() {
		String timeDate = Utils.dateFormat();
		extent = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\" + timeDate + ".html");
		test = extent.startTest("RCB Team Validation");
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\resources\\log4j.properties");
		log.info("Logger has been Initialized");
		

	}

	
	public static String filetoString(String path)
	{
		String fileresultString = null;
		try {
			fileresultString = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileresultString;
	}
	public static JsonPath jsonObject(String value)
	{
		
		JsonPath json=new JsonPath(value);
		
		return json;	
	}

	public void onTestStart(ITestResult result) {
		
		log.info(result.getName()+"Test has been started");
		test.log(LogStatus.INFO, result.getName()+"Test has been started ");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Completed Test Sucessfully");
		

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.error(result.getName()+"Test has been failed");
		test.log(LogStatus.FAIL, result.getName()+"Test has been Failed ");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@AfterClass
	public void closetest() {
		extent.endTest(test);
		extent.flush();
	}

}
