package day44_ExplicitwaitinSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class ExplicitWaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= UtilityL.startBrowser("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		for(int i=0;i<=10;i++)
		{
				
		try {
			
			Alert alt= driver.switchTo().alert();
			String altText=alt.getText();
			if (altText.contains("Selenium"))
			{
				System.out.println("Test Validated");
				
			}
			else 
			{
				System.out.println("Test Validation Fail");

			}
			alt.accept();
			
			break;
			
		} catch (NoAlertPresentException e) 
		{
			System.out.println("We are waiting for Alert to Display");
			
		}
		Thread.sleep(1000);
		}
		
		driver.quit();

	}

}
