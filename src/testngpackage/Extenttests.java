package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extenttests {
WebDriver d;
String url = "https://www.facebook.com/";
ExtentHtmlReporter extent;
ExtentTest test;
ExtentReports report;


@BeforeTest
public void test() {
extent = new ExtentHtmlReporter("./myreport1/facebook.html");
extent.config().setDocumentTitle("Automation Report");
extent.config().setReportName("Functional test");
extent.config().setTheme(Theme.DARK);

report = new ExtentReports();
report.attachReporter(extent);
report.setSystemInfo("Hosetname","Localhost");
report.setSystemInfo("OS","Windows 08");
report.setSystemInfo("Tester name", "Sam");
report.setSystemInfo("Browser name","Chrome");

d= new ChromeDriver();
}
@BeforeMethod
public void url() {
	d.get(url);
}
@Test
public void Test1() {
	test= report.createTest("FB Title Verification");
	String exp = "Facebook";
	String actual= d.getTitle();
	Assert.assertEquals(exp,actual);
	}
@Test
public void logo() {
	
}
@AfterMethod
public void browserclose(ITestResult result){
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,"Test case failed is"+ result.getName());
		test.log(Status.FAIL,"Test case failed is "+ result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SKIP){
		test.log(Status.SKIP,"Test case skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,"Test case passed is "+result.getName());
	}
}
@AfterTest
public void teardown() {
	report.flush();
}
}