package Listeners;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Generic_Scripts.Capture_ScreenShot;
import Utils.PropertyFile_Script;

public class Listener1 implements ITestListener
{
	public WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TC Pass");
	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC Failed");
		
	}
	

}
