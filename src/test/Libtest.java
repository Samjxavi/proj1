package test;

import org.testng.annotations.Test;

import pages.libpages;

public class Libtest extends Baseforopenlib{
@Test
public void test1() {
	libpages ob = new libpages(d);
	ob.login1();
}
}
