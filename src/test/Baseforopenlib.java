package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseforopenlib {
WebDriver d;
@BeforeClass
public void setup() {
	d= new ChromeDriver();
	d.get("https://openlibrary.org/");
}
}
