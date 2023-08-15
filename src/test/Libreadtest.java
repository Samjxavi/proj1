package test;

import org.testng.annotations.Test;

import pages.Libreadpage;



public class Libreadtest extends Baseforopenlib {
@Test
public void test1() {
	Libreadpage oj = new Libreadpage(d);
	oj.home();
}
}
