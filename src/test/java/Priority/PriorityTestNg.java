package Priority;

import org.testng.annotations.Test;

public class PriorityTestNg {
	



	@Test(priority = 0)
	public void TestFirst() {
		System.out.println("Test First");  //2

	}

	@Test(priority = 1)
	public void TestSecond() {
		System.out.println("Test Second"); //3
	}

	@Test(priority = -1)
	public void TestThird() {
		System.out.println("Test Third");  //1
	}

	@Test(priority = 'a')
	public void TestForth() {
		System.out.println("Test Forth"); //4 
	}

}
