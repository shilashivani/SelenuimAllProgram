package practice;

import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class AssertionPractice {
	public static void main(String[] args) {
		String [] ar= {"shila","veidika","shivani"};
		String [] ar2={"vedika","shila","shivani"};
	
     SoftAssert soft=new SoftAssert();
     soft.assertTrue(ar==ar2);
  System.out.println("After Soft Asert");
     
		soft.assertAll();
		
		
	}

}
