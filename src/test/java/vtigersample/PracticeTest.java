package vtigersample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class PracticeTest {
	//pull changes done
	WebDriver driver;
	@Test
	
	public void m1()
	{
		
		String Browser=System.getProperty("browser");
		String Url = System.getProperty("url");
		
		if (Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get(Url);
	}
}
