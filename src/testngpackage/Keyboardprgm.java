package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keyboardprgm {
	ChromeDriver d;
	@BeforeTest
	public void setup() {
		d = new ChromeDriver();
		System.out.println("Open browser");
	}
	
	@BeforeMethod
	public void urlloading() {
		d.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void Test1() {
		WebElement wb = d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		wb.sendKeys("Sam");
		WebElement wb1 = d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act = new Actions(d);
		act.keyDown(wb,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(wb,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(wb1,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	
}
