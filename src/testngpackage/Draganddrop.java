package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	ChromeDriver d;
	
	@BeforeTest
	public void setup() {
		d= new ChromeDriver();
		System.out.println("Open browser");
	}
	
	@BeforeMethod
	public void urlloading() {
		d.get("https://demoqa.com/droppable");
		
	}
	@Test
	public void test() {
		Actions act = new Actions(d);
		WebElement wb1 = d.findElement(By.id("draggable"));
		WebElement wb2 = d.findElement(By.id("droppable"));
		act.dragAndDrop(wb1, wb2).perform();
	
		String s = wb2.getText();
		if (s.equals("Dropped!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
}
