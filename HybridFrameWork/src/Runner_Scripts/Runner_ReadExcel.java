package Runner_Scripts;

import org.testng.annotations.Test;

import Generic_Scripts.BaseClass;
import Generic_Scripts.FetchData_Excel;
import POM_Scripts.POM_FB_Login;

public class Runner_ReadExcel {
	public class Runner_FB extends BaseClass
	{
		@Test
		public void fb_login() throws InterruptedException {
		
			 POM_FB_Login fl= new POM_FB_Login(driver);
			
			 fl.userName(FetchData_Excel.getData("Sheet1", 0, 0));
			 Thread.sleep(2000);
			 fl.password(FetchData_Excel.getData("Sheet1", 0, 1));
			 Thread.sleep(4000);
			 fl.login();
			 
			 
		}
		

}
}