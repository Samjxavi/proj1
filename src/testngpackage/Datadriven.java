package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
ChromeDriver d;
@BeforeTest
public void setup() {
	d= new ChromeDriver();
}

@Test
public void Facebook() throws IOException {
	FileInputStream f = new FileInputStream("‪‪E:\\datadriven.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(f);
	XSSFSheet sh = wb.getSheet("Sheet1");
	
	int rowcount = sh.getLastRowNum();
	for (int i=1;i<=rowcount;i++) {
		String uname = sh.getRow(i).getCell(0).getStringCellValue();
		String pass = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Username: "+uname);
		System.out.println("Password: "+pass);
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys(uname);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		d.findElement(By.xpath("//button[@value='1']")).click();
	}
}

}
