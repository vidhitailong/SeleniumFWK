package Generic_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.PropertyFile_Script;

public class BaseClass extends PropertyFile_Script{
public WebDriver driver;
	
	@BeforeMethod
	public void open_App() throws InterruptedException, FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(PropertyFile_Script.fetchProperty());
		  Thread.sleep(8000);
	}
	
	@AfterMethod
	public void close(ITestResult res) throws IOException {
		if(ITestResult.FAILURE==res.getStatus())
		{
			Capture_ScreenShot.get_photo(driver);
		}
		driver.close();
		
	}


}
