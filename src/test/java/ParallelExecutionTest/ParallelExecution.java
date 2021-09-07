package ParallelExecutionTest;

import java.util.Date;

import org.testng.annotations.Test;

public class ParallelExecution {

	
	Date date=new Date();

	
	@Test
	public void TestFirst()    
	{
		System.out.println("I am parallel test First  " +date);
	}
	
	@Test
	public void TestSecond()      
	{
		System.out.println("I am parallel test Second  "+date);
	}
}
