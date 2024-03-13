package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Scripts.BasePage_POM;
import Generic_Scripts.FetchData_Excel;

public class POM_FB_Login extends BasePage_POM {
	//Declaration
	
	@FindBy(id="email")
	private WebElement UName;
	@FindBy(id="pass")
	private WebElement Pwd;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement Login;
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
	private WebElement Ser;
	@FindBy(xpath="//span[text()='Anshuman']")
	private WebElement Ans;
	
	//Initialization
	public POM_FB_Login(WebDriver driver)
	{
		
		super(driver);
	}
	
	//Utilization
	
public void userName(String username) 
{
	UName.sendKeys(username);
	
}
	public void password(String passWord) {
		Pwd.sendKeys(passWord);
	}
public void login() {
	Login.click();
}
public void search(String Name) {
	Ser.sendKeys(Name);
}
public void nameFriend() {
	Ans.click();
}

}


