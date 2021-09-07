package ParameterAndDataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTestNG {
	
	
	//Go to ParametrTestNG.xml and run as TestNG
	
	
	@Test
	@Parameters({"SuiteLevelKey1","SuiteLevelKey2"})
	public void getSuiteLevelParameter(String SuiteValue1,String SuiteValue2)
	{
		
		System.out.println(SuiteValue1 );
		System.out.println();
		System.out.println(SuiteValue2 );
		
		System.out.println("-------------------------------");
	}

	
	

	@Test
	@Parameters({"TestLevelKey1","TestLevelKey2"})
	public void getTestLevelParameter(String TestValue1,String TestValue2)
	{
		
		System.out.println(TestValue1 );
		System.out.println();
		System.out.println(TestValue2 );
	}
}
