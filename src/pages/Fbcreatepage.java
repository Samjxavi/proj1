package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
WebDriver d;
By create = By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By start = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");

public Fbcreatepage(WebDriver d2) {
	// TODO Auto-generated constructor stub
	this.d=d2;
}

public void login() {
	d.findElement(create).click();
	d.findElement(start).click();
}
}
