package day41_switchtoCommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class HandlesAlerts3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =UtilityL.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]")).click();
		
		Alert alt=	driver.switchTo().alert();
		Thread.sleep(3000);
		alt.sendKeys("Selenium");
		alt.accept();
		//alt.dismiss();
		
		

	}

}
