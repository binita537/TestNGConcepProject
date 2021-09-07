package SkipandFailedTestCase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipAndFailed {

	
	
    @Test
	public void SkipTestCase()
	{
		throw new SkipException("This is skipped test case ");
	}
	
	@Test
	public void ForcefullySkipTestCase()
	{
		
		Assert.fail("This forcefully failed test case");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
