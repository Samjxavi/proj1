package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Naveenpage {
public Naveenpage(WebDriver d2) {
		// TODO Auto-generated constructor stub
	this.d=d2;
	}
WebDriver d;
By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
By register = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

public void home() {
	d.findElement(account);
	d.findElement(register);
}

}
