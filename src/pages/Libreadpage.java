package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Libreadpage {
WebDriver d;
By read = By.xpath("//*[@id=\"slick-slide22\"]/div[2]/div/a");
By next = By.xpath("//*[@id=\"BookReader\"]/div[2]/div/nav/ul[2]/li[3]/button/div");
By home = By.xpath("//*[@id=\"topnav\"]/ia-topnav/div[1]/primary-nav/nav/div[1]/a/svg[2]/g/g/path[3]");

public Libreadpage(WebDriver d2) {
	// TODO Auto-generated constructor stub
	this.d=d2;
}



public void home() {
	d.findElement(home);
	d.findElement(next);
	d.findElement(read);
}
}
