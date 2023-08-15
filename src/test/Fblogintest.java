package test;


import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass {

	@Test
	public void test1() {
		Fbloginpage ob = new Fbloginpage(d);
		ob.setvalues("asd@gmail.com", "null");
		ob.login();
	}
}
