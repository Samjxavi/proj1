package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionhardtest {
	
	ChromeDriver d;
	
	@BeforeTest
	public void setup() {
		d= new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		d.get("https://www.google.com");
	}
	@Test
	public void test1() {
		String actual = d.getTitle();
	//	String expected = "Google.com";  // failure
		String expected1 = "Google";  // pass
		Assert.assertEquals(expected1, actual);
		System.out.println("Hello");
	}

}
