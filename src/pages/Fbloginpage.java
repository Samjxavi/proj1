package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
WebDriver d;

By fbemail = By.id("email");
By fbpass = By.id("pass");
By fblogin = By.name("login");

public Fbloginpage(WebDriver d) {
	// TODO Auto-generated constructor stub
	this.d=d;
}
public void setvalues(String email, String password) {
	d.findElement(fbemail).sendKeys(email);
	d.findElement(fbpass).sendKeys(password);
}
public void login() {
	d.findElement(fblogin).click();
}
}
