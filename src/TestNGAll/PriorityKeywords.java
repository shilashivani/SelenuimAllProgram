package TestNGAll;

import org.testng.annotations.Test;

public class PriorityKeywords {
	@Test(priority = 1,invocationCount = 3)
	public void test1() {
		System.out.println("This is test 1 invocstion 3 priority 1");
	} 
	@Test(timeOut = 500)
	public void test() throws InterruptedException {
		System.out.println("This Is test time out");
		Thread.sleep(1000);
	}
	@Test(priority = -1 , enabled=false)
	public void test2() {
		System.out.println("This is test 2 enabled test");
	}
	@Test(priority = 2,dependsOnMethods = {"test1"})
	public void test3() {
		System.out.println("This is test 3 depends methods on test");
	}
	
	
	
	
	
	

}
