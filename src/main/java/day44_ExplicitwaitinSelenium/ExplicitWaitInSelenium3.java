package day44_ExplicitwaitinSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.UtilityL;

public class ExplicitWaitInSelenium3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= UtilityL.startBrowser("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='passnew']")))).sendKeys("admin@123");
		
		
		//driver.quit();

	}

}
