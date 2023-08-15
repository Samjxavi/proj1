package test;


import org.testng.annotations.Test;

import pages.Fbcreatepage;

public class Fbcreatetest extends Baseclass{


@Test
public void test1() {
	Fbcreatepage ob = new Fbcreatepage(d);
	ob.login();
}
}
