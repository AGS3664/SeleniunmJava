package day43_HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class HandleFrames2 {

	public static void main(String[] args) {
		
		
	WebDriver driver= UtilityL.startBrowser("https://www.rediff.com/");
	
	
	//NoSuchFrameException
	driver.switchTo().frame("Mukesh");
	
	String bseIndex=driver.findElement(By.id("bseindex")).getText();
	
	System.out.println("Current Index value is "+bseIndex);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		

	}

}
