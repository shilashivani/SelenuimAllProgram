package TestNGAll;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityToCheck {

	@Test(priority = -1)
	@Parameters({"a","b"})
	public void test1(int a,int b) {
		System.out.println(a+b);
	}
	@Test
	@Parameters({"s"})
	public void test2(String i) {
		System.out.println(i);
	}
	
	public void test3() {
		System.out.println("This is test 2 double");
	}
	@Test(priority = 2)
	public void test4() {
		System.out.println("This is test 4");
	}
}
