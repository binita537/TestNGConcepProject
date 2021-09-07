package CrossBrowserTestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	
	//Go to \CrossBrowserTestNG.xml and run as TestNg 
	
	@Test
	@Parameters("browser")
	public void chromeTest(@Optional("optional")String browserName)
	{
		
		System.out.println("I will execute on "+browserName);
		
	}
	
	
}
