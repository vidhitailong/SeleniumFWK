package TestNG_DataProvider;

import org.testng.annotations.Test;

public class RunnerClass_DataPro {
	@Test(dataProvider = "LoginCredentaial", dataProviderClass = DataProvider1.class)

	public void Login(String UN, String Pwd)
	{
		System.out.println(UN +","+ Pwd);
	}

}
