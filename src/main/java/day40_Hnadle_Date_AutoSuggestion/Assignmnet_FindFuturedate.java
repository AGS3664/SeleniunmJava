package day40_Hnadle_Date_AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet_FindFuturedate {
	// Select future date - 14th Feb 2025
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				
		driver.findElement(By.id("datepicker")).click();
					
		// capture month //span[contains(@class,'datepicker-month')]
		
		 WebElement month=driver.findElement(By.xpath("//span[contains(@class,'datepicker-month')]"));
				
		// capture year //span[contains(@class,'datepicker-year')]
		 WebElement year=driver.findElement(By.xpath("//span[contains(@class,'datepicker-year')]"));

		 WebElement alldates= driver.findElement(By.xpath("//table[contains(@class,\"datepicker\")]//td//a"));
		 
		 
		 
			/*
			 *  if condition
			 *  	month = feb && year 2025
			 *  then 
			 *  	click on 14th
			 * 
			 */
		
		/* for (WebElement ele :alldates) {
			 
			 String dates=ele.getText();
			 System.out.println("Dates are: "+dates);
		
			 if (dates.equalsIgnoreCase("14")) {
				
			
			 if (month.equals("February")  && year.equals("2025")) 
				{
					month.click();
					year.click();
					ele.click();
					
				}
				
				else {
					driver.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
					
				}
			 
			 }
		}*/
		
				
	}

}
