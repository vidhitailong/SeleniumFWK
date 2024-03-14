package Runner_Scripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Scripts.BaseClass;
import Generic_Scripts.FetchData_Excel;
import POM_Scripts.POM_FB_Login;

public class Runner_FB extends BaseClass
{
	@Test(dataProvider = "LoginCredentialsFB")
	public void fb_login(String UN, String PWD) throws InterruptedException {
	
		 POM_FB_Login fl= new POM_FB_Login(driver);
		
		 fl.userName(UN);
		 Thread.sleep(2000);
		 fl.password(PWD);
		 Thread.sleep(4000);
		 fl.login();
		 System.out.println("tbdfhhdhhis testcase will be executed done");
			 
	}
	

	@DataProvider(name="LoginCredentialsFB")
	public Object[][] createData1(){
		return new Object[][]{{"xyz","123"},{"ucd", "7837"}};
		
	}
	
}
