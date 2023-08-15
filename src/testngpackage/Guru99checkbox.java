package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99checkbox {
ChromeDriver d;

@BeforeTest
public void setup() {
	d=new ChromeDriver();
}
@BeforeMethod
public void urlloading() {
	d.get("https://demo.guru99.com/test/upload/");
}
@Test
public void Test1() {
	WebElement wb = d.findElement(By.xpath("//input[@type='checkbox']"));
	boolean b = wb.isSelected();
	System.out.println("Check box selected: "+b);
	WebElement wb1= d.findElement(By.xpath("//input[@type='file']"));
	wb1.sendKeys("C:\\Users\\Dell\\Pictures\\f2.jpg");
	wb1.click();
//	WebElement wb2=d.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
//	wb2.click();
}


}
