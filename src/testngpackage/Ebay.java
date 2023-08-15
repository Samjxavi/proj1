package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
ChromeDriver d;
@BeforeTest
public void setup() {
	d= new ChromeDriver ();
	System.out.println("Open browser");
}
@BeforeMethod
public void urlloading() {
	d.get("https://www.ebay.com");
	System.out.println("open link");
}
@Test
public void Test1() {
	Actions act = new Actions(d);
	WebElement wb = d.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	act.moveToElement(wb).perform();
	// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); - implicit wait
	WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
	WebElement wb1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"mainContent\\\"]/div[1]/ul/li[3]/a")));
	wb1.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
}
}
