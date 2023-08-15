package test;

import org.testng.annotations.Test;

import pages.Naveenpage;

public class Naveentest extends Naveenbase {
@Test
public void test() {
	Naveenpage ob = new Naveenpage (d);
	ob.home();
}
}
