package RetryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicSecondWay {
	
	
	
	//to retry the failed test case this is the Second way
	
	// GO to  RetryFailedTestCAseLogicTestNg.xml and run as TEstNg
	
	@Test
	public void retrySecondLogicTestOne()
	{
		System.out.println("I am failed test case  One and will retry to execute");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void retrySecondLogicTestTwo()
	{
		System.out.println("I am failed test case Two and will retry to execute");
		Assert.assertEquals(true, false);
	}
	
	
	

}
