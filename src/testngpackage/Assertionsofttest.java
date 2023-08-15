package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionsofttest {

	ChromeDriver d;
	@BeforeTest
	public void setup() {
		d= new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		d.get("https://www.google.com");
	}
	@Test
	public void Test1() {
		String actual = d.getTitle();
		String expected1 = "google.com"; // fail
	//	String expected = "Google"; //pass
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expected1, actual);
		System.out.println("Hello");
	}
}
