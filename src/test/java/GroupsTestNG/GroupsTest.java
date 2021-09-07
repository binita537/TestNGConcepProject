package GroupsTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
	
	
	
	// @BeforeGroups if you define like that then it wont run 
	
	//@BeforeGroups("smoke") if you define like that it will run before and after smoke groups
	
	
	@BeforeGroups("smoke")
	 public void beforeGroupsTest()
	 {
		System.out.println("I will run before groups"); 
	 }
	 
	 
	@AfterGroups("smoke")
	 public void afterGroupsTest()
	 {
		System.out.println("I will run after groups"); 
	 }
	
	
	@Test(groups = "smoke")
	public void smokeTestOne()
	{
		
		System.out.println("I am smoke group test one");
		
	}
	
	
	@Test(groups = "smoke")
	public void smokeTestTwo()
	{
		System.out.println("I am the smoke test two");
	}
	
	
	
	

	@Test(groups = "functional")
	public void functionalTestOne()
	{
		
		System.out.println("I am functional group test one");
		
	}
	
	
	@Test(groups = "sanity")
	public void SanityTestOne()
	{
		System.out.println("I am the sanity test two");
	}
	
	
	
	

}
