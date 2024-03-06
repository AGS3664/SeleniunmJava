package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UtilityL {
	
	public static void selectValuefromList(WebDriver driver,String xpathValue,String Value) 
	{
		List<WebElement> allsuggetions= driver.findElements(By.xpath(xpathValue));
		for(WebElement ele:allsuggetions)
		{
			String allvalues=ele.getText();
			System.out.println("Values are: "+allvalues);
			
			if(allvalues.equalsIgnoreCase(Value))
			{
				ele.click();
				break;
			}

		}
	}
	
	public static void selectValuefromList(WebDriver driver,By locator,String Value) 
	{
		List<WebElement> allsuggetions= driver.findElements(locator);
		for(WebElement ele:allsuggetions)
		{
			String allvalues=ele.getText();
			System.out.println("Values are: "+allvalues);
			
			if(allvalues.equalsIgnoreCase(Value))
			{
				ele.click();
				break;
			}

		}
	}
	

	public static WebDriver startBrowser(String appURL) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		
		return driver;
		
	}
	
	public static WebDriver startBrowser(String browser,String appURL) 
	{
		WebDriver driver =null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else {
			System.out.println("Sorry, Browser not supported");
		}
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
		
	}
	
		}