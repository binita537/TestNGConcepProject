package ReporterLogs;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationReprterLogs {

	//To see the logs go to test-output folder and open the emailalble report 
	
	
	@Test
	public void Login_Test() {
		System.out.println("Do the Login into Application ");
		Reporter.log("This the logs generated for Login_Test ");
	}

	
	@Test
	public void Register_Test() {
		System.out.println("Do the Register into Application ");
		Reporter.log("This the logs generated for Register_Test");
	}
	

}
