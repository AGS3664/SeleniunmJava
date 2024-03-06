package day41_switchtoCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class HandlesAlerts2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =UtilityL.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
