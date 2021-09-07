package DependsOn;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	// Go to DependsOnTestng.xml and run as TestNG
	
	@Test
	public void FirstTest()
	{
		System.out.println("I am depends on SeconTest");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("I am second Test");
	
	}
}
