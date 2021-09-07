package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependsOnTestNG {
	
	
	// dependsOnMethods and dependsOnGroups 
	//we can mention in @test and testng.xml as well 
	
	//we can provide the on test and groups as well 
	
	
	@Test(dependsOnMethods = "SecondTest")
	public void FirstTest()
	{
		System.out.println("I am depends on SeconTest");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("I am second Test");
	
	}
	
	
	
	@Test(dependsOnGroups = "smoke")
	public void TestOne()
	{
		
		
		System.out.println("I am depends on smoke groups");
	}
	
	@Test(groups = "smoke")
	public void TestTwo()
	{
		
		System.out.println("I am smoke group");
		
	}
	
	

}
