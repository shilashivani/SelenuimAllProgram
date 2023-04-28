package TestNGAll;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnotation {
		@Test
	public void test1() {
		System.out.println("I am Test1");
	}
	@Test
	public void test2() {
		System.out.println("I am test2");
	
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am Before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("I am afterClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am AfterMethod");
	}
	@BeforeTest 
	public void beforeTest() {
		System.out.println("I am Before Test");
	}
	
	

}
