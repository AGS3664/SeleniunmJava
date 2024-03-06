package day40_Hnadle_Date_AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.UtilityL;

public class HandlesDates_Utility {

	public static void main(String[] args) {
		
	WebDriver driver=	UtilityL.startBrowser("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	UtilityL.selectValuefromList(driver, "//table[contains(@class,\"datepicker\")]//td/a", "25");

	}

}
