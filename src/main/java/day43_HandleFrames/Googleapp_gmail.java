package day43_HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class Googleapp_gmail {

	public static void main(String[] args) {
		
		WebDriver driver = UtilityL.startBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//a[contains(@aria-label,\"Google apps\")]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"app\"]")));
		driver.findElement(By.xpath("//a[contains(@href,\"https://mail.google.com/mail/\")]")).click();
		
		
		
		
	}

}
