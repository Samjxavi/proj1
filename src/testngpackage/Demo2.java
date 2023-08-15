package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
@BeforeTest
public void setup() {
	System.out.println("Browser opens");
}
@BeforeMethod
	public void urlloading() {
	System.out.println("Url Loading");
}
@Test(enabled=false) // enabled false so it will not excite
public void Testing1() {
	System.out.println("Test 1");
}
@Test(priority=2,alwaysRun=true)// exicutes even if there is any error
public void Testing2() {
	System.out.println("Test 2");
}
@Test(priority=1,invocationCount=3) // priority set 1 so it will excitue first and count 3
public void Testing3() {
	System.out.println("Test 3");
}
@Test(dependsOnMethods="Testing2") // no priority set o it will exicute first
	public void Testing4() {
System.out.println("Test 4");		
	}

@AfterMethod
public void aftermethod() {
	System.out.println("Url Closes");
}
@AfterTest
public void tesrdown() {
	System.out.println("Browser closes");
}


}
