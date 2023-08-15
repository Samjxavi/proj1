package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99rightclick {
ChromeDriver d;

@BeforeTest
public void setup() {
	d= new ChromeDriver();
}
@BeforeMethod
public void urlloading() {
	d.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void Test1() {
	Actions act = new Actions(d);
	WebElement wb = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.contextClick(wb).perform();
	WebElement wb1 = d.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	wb1.click();
	d.switchTo().alert().accept();
	
}


}
