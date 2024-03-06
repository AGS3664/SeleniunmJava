package day41_switchtoCommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class HandlesAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =UtilityL.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]")).click();
		
		Alert alt=	driver.switchTo().alert();
		
		String text= alt.getText();
		
		if (text.contains("JS Alert")) 
		{
			System.out.println("Validation 1 Passed - Alert Verified");
		} 
		else 
		{
			System.out.println("Validation 1 Failed - Alert Verification Failed");
		}
		
		Thread.sleep(5000);
		
		alt.accept();

	}

}
