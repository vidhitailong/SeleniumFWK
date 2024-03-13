package Generic_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_FrameWork_Constants implements Framework_Constant
{
	public WebDriver driver;
	public WebDriver driver1;
	
	@BeforeMethod
	public void open_App() throws InterruptedException
	{
		System.setProperty(Key_Chrome, Value_Chrome);
		System.setProperty(Key_Edge, Value_Edge);
		driver= new ChromeDriver();
		driver1= new EdgeDriver();
		 driver1.get("https://www.google.com");
		 Thread.sleep(4000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(5000);
	}
	@AfterMethod
	
	public void close()
	{
		driver1.close();
	
}}
