package Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Scripts.BaseClass;
import POM_Scripts.POM_FB_Login;
import Utils.PropertyFile_Script;

public class Listener_Runner extends BaseClass{
	
	@Test(dataProvider = "LoginCredentialsFB")
	
		public void fb_login(String UN, String PWD) throws InterruptedException {
			
			 POM_FB_Login fl= new POM_FB_Login(driver);
			
			 fl.userName(UN);
			 Thread.sleep(2000);
			 fl.password(PWD);
			 Thread.sleep(4000);
			 fl.login();	
		
	}
	@DataProvider(name="LoginCredentialsFB")
	public Object[][] createData1(){
		return new Object[][]{{"xyz","123"},{"ucd", "7837"}};
	}
}
