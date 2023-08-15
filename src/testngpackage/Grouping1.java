package testngpackage;

import org.testng.annotations.Test;

public class Grouping1 {

	@Test(groups={"sanity","smoke"})
	public void Test1() {
		System.out.println("Test 1");
	}
	@Test(groups="regression")
	public void Test2() {
		System.out.println("Test 2");
	}
	@Test(groups="sanity")
	public void Test3() {
		System.out.println("Test 3");
	}
	@Test(groups="regression")
	public void Test4() {
		System.out.println("Test 4");
	}
}
