package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void BeforeSuite_Test() {
		System.out.println("initiate the logs for reporting purpose");
	}

	@BeforeTest
	public void beforeTest_Test() {
		System.out.println("Opened Datatbase connection ");
	}

	@BeforeMethod
	public void beforeMethod_Test() {
		System.out.println("Initilising the drover object - open the browser");
	}

	@Test
	public void Login_Test() {
		System.out.println("Do the Login into Application ");
	}

	
	@Test
	public void Register_Test() {
		System.out.println("Do the Register into Application ");
	}
	@AfterMethod
	public void afterMethod_Test() {
		System.out.println("Closeing the driver - close the browser ");
	}

	@AfterTest
	public void afterTest_Test() {
		System.out.println("CLosed Database connection");
	}

	@AfterSuite
	public void afterSuite_Test() {
		System.out.println("flusing the report meand generating the report");
	}
	
	 @BeforeClass
	 public void beforeClass() {
	   System.out.println("This will execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("This will execute after the Class");
	 }

}
