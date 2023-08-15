package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffdemo {
	ChromeDriver d;
	@BeforeTest
	public void setup() {
		d= new ChromeDriver();
		System.out.println("Open browser");
	}
	@BeforeMethod
	public void urlloading() {
	d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	System.out.println("url opens");
	}
	@Test
	public void radiobutton() {
		WebElement wb= d.findElement(By.xpath("//input[@value='m']"));
		boolean b= wb.isSelected();
		WebElement wb1= d.findElement(By.xpath("//input[@value='f']"));
		boolean b1=wb1.isSelected();
		System.out.println("Radio button male is selected "+b);
		System.out.println("Radio button female is selected "+b1);
	}
@Test
public void logo() {
	WebElement wb2 = d.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']"));
	boolean b2 =wb2.isDisplayed();
	System.out.println("Logo is displayed "+b2);
}
@Test
public void createbutton() {
	WebElement wb3 = d.findElement(By.xpath("//input[@type='submit']"));
	boolean b3 =wb3.isEnabled();
	System.out.println("Create button is enabled "+b3);
}
@AfterMethod
public void urlclose() {
	System.out.println("url close");
}
@AfterTest
public void Teardown() {
	System.out.println("Browser close");
}
}
