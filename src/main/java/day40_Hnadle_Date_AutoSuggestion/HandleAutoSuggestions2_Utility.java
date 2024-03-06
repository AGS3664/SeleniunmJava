package day40_Hnadle_Date_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.UtilityL;

public class HandleAutoSuggestions2_Utility {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=UtilityL.startBrowser("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
	
	driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
	Thread.sleep(3000);
	
	UtilityL.selectValuefromList(driver,"//ul[contains(@class,\"autocomplete \")]//li//div","Java");
	
	
	}
	
	
}
