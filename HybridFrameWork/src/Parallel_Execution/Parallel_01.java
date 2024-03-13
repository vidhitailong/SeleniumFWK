package Parallel_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_01 {

	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void execute(String browser) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./Softwares/msedgedriver.exe");
		
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(4000);
			driver.findElement(By.name("username")).sendKeys("vidhitailong");
			driver.findElement(By.name("password")).sendKeys("Yuvaan*2019");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		else
		{
			driver= new EdgeDriver();
			driver.get("https://www.google.com/");
		}
	}
}
