package RetryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicFirstWay {
	
	
	
	//to retry the failed test case this is the first way
	
	@Test(retryAnalyzer =RetryFailedTestCase.RetryAnalyzerTest.class )
	public void retryTestOne()
	{
		System.out.println("I am failed test case  One and will retry to execute");
		Assert.assertEquals(true, false);
	}
	
	@Test(retryAnalyzer =RetryFailedTestCase.RetryAnalyzerTest.class )
	public void retryTestTwo()
	{
		System.out.println("I am failed test case Two and will retry to execute");
		Assert.assertEquals(true, false);
	}
	
	
	

}
