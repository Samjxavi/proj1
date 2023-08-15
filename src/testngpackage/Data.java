package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data {
ChromeDriver d;

@BeforeTest
public void setup() {
	d = new ChromeDriver();
}
@Test
public void Test() throws IOException {
	FileInputStream f = new FileInputStream("E:\\datadriven.xlsx");
	XSSFWorkbook xs = new XSSFWorkbook(f);
	XSSFSheet sh = xs.getSheet("Sheet1");
	
	int rowcount = sh.getLastRowNum();
	for (int i = 1;i<=rowcount;i++) {
		d.get("https://www.facebook.com/");
		String uname = sh.getRow(i).getCell(0).getStringCellValue();
		String pass = sh.getRow(i).getCell(1).getStringCellValue(); 
		System.out.println("Username: "+uname);
		System.out.println("Password: "+pass);
		d.findElement(By.xpath("//input[@type='text']"));
		d.findElement(By.xpath("//input[@type='password']"));
		d.findElement(By.xpath("//button[@value='1']")).click();
	}
}

}
