package DataProviderWithExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWIthExcel {

	//dataProviderClass if you dataprovider method is in different class
	
	
	
	@Test(dataProvider = "getData",dataProviderClass = DataProviderWIthExcel.class)
	public void main_Test(String username,String password)
	{
		System.out.println(username  +"   "+password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=ExcelReader.getTestData("SampleData");
		return data;
	}
	
	
	
	
	
}
