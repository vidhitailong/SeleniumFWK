package TestNGGroups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"Functional"})
	public void googleMaps() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Mysore");
System.out.println("Test");
	}
	@Test(groups = {"Regression"})
	public void zomato() throws InterruptedException
	{

		System.setProperty("webdriver.edge.driver","./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.zomato.com/bangalore");
		/*Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish' and @class='sc-iysEgW jGCDDj']"));
	    ele.sendKeys("Ner.lu Cafe");
	    Thread.sleep(1000);
	   ele.click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='sc-fATqzn jTgEBX']")).click();*/
	 System.out.println("Test1");
	}
	
	@Test(groups = {"Sanity"})
	public void group1() 
	{
		System.setProperty("webdriver.edge.driver","./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com");
	
		System.out.println("Hello All");
	}

}
