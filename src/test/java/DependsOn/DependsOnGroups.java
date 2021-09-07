package DependsOn;

import org.testng.annotations.Test;

public class DependsOnGroups {
	

	
	// Go to DependsOnTestng.xml and run as TestNG
	
	@Test(groups = "Login")
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
