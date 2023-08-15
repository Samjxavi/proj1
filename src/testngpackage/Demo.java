package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	@BeforeTest
	public void setup() {
		System.out.println("open browser");
	}
	@BeforeMethod
	public void urlloading() {
		System.out.println("Url Loading");
	}
	@Test
	public void Testing1() {
		System.out.println("Test 1");
	}
	@Test
	public void Testing2() {
		System.out.println("Test 2");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Url Close");
	}
	@AfterTest
	public void teardown() {
		System.out.println("Browser closes");
	}
}
