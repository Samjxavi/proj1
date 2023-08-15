package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class libpages {
WebDriver d;

By select = By.xpath("//*[@id=\"slick-slide14\"]/div[1]/a/img");
By next = By.xpath("//*[@id=\"editions\"]/tbody/tr[1]/td[2]/div[2]/ul/li/div/a");
By give = By.xpath("//*[@id=\"bookPreview\"]/div/div[1]/a");



public libpages(WebDriver d2) {
	// TODO Auto-generated constructor stub
	this.d=d2;
}



public void login1 () {
	d.findElement(select).click();
	d.findElement(next).click();
	d.findElement(give).click();
}}