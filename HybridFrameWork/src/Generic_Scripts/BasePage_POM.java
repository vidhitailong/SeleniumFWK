package Generic_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage_POM {
	public WebDriver  driver;
	public BasePage_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
} 



