package TestNGAll;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupByTestNGAnotation {
	@BeforeGroups("Group1")
	public void beforegroup() {
		System.out.println("Execution started for group 1");
	}
	@AfterGroups("Group1")
	public void afterGroup() {
		System.out.println("Execution ended for group 1");
	}
	@Test (priority= 1,groups ="Group1")
public void setPriority() {
		System.out.println("priority 1 for group 1 test");
	}

}
