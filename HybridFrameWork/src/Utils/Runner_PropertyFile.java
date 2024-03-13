package Utils;


import org.testng.annotations.Test;

import Generic_Scripts.BaseClass;
import POM_Scripts.POM_FB_Login;

public class Runner_PropertyFile extends BaseClass  {
	
	@Test
	public void facebook() throws InterruptedException {
		
	 POM_FB_Login fl= new POM_FB_Login(driver);
	 fl.userName("vidhitailong");
	 Thread.sleep(2000);
	 fl.password("Yuvaan*2019");
	 Thread.sleep(4000);
	 fl.login();
	 Thread.sleep(6000);
	 fl.search("Anshuman Goswamy");
	 Thread.sleep(4000);
	 fl.nameFriend();
	 

}
}
