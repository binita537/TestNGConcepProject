package ExcludeAndInclude;

import org.testng.annotations.Test;

public class EnabledAndDisabledMethods {

	

	@Test(enabled = true)
	public void TestFirst() {
		System.out.println("Test First"); 

	}

	@Test(enabled = false)
	public void TestSecond() {
		System.out.println("Test Second");
	}

	@Test(enabled = true)
	public void TestThird() {
		System.out.println("Test Third"); 
	}

	@Test(enabled = false)
	public void TestForth() {
		System.out.println("Test Forth"); 
	}
	
	
	
	
}
