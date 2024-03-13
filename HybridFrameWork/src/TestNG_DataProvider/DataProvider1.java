package TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	@DataProvider(name="LoginCredentaial")
	public Object[][] getData(){
		Object[][] data= {{"Vidhi","123"},{"Yuvaan","345"},{"Anshuman","456"}};
		return data;
	}

}
