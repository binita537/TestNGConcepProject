package Annotations;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupsTest {
	
	
	@BeforeGroups("smoke")
	public void beforeGroupsTest()
	{
		System.out.println("I will execute brfore groups -smoke");
	}
	
	@AfterGroups("smoke")
	public void afterGroupsTest()
	{
		System.out.println("I will execute after groups -smoke");
	}
	
	
	

	@Test(groups = "smoke")
	public void Login_Test() {
		System.out.println("Do the Login into Application ");
	}

	
	@Test(groups = "smoke")
	public void Register_Test() {
		System.out.println("Do the Register into Application ");
	}
}
