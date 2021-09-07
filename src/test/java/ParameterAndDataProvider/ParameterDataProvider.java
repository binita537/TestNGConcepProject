package ParameterAndDataProvider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterDataProvider {

	
	@Test(dataProvider = "getData")
	public void dataProviderMethod(String firstcol,String secondcol,String thirdcol) {


		System.out.println(firstcol +" || "+secondcol+" || "+thirdcol);
	}

	
	@DataProvider
	public Object[][] getData() {

		Object data[][] = new Object[2][3];

		data[0][0] = "first row first col";
		data[0][1] = "first row second col";
		data[0][2] = "first row and third col";

		data[1][0] = "second row and first col";
		data[1][1] = "second row and second col";
		data[1][2] = "second row and third col";

		return data;
	}

}
