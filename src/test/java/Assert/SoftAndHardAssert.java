package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	@Test(description = "I am validating the Hard Assert")
	public void HardAssertTest() {

		String actual = "Binita";
		String expected = "BinitaBT";

		Assert.assertEquals(actual, expected);

	}

	@Test(description = "I am validation the soft asser when the bugs is not high priority ")
	public void SoftAssert() {

		SoftAssert softassert = new SoftAssert();

		System.out.println("I  am the first  soft Assert");

		softassert.assertEquals(true, false);

		System.out.println("I  am the second  soft Assert");

		softassert.assertEquals("one", "One");

		softassert.assertAll(); //I want everything will execute but test case should fail (If any assert fail)
		

	}

}
