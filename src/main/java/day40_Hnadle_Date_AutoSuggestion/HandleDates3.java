package day40_Hnadle_Date_AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),\"28\")]")).click();
		
		

	

	}

}
