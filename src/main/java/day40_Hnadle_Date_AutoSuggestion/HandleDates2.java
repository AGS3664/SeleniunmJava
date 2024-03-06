package day40_Hnadle_Date_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> alldates=	driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td//a"));
		
		for (WebElement ele : alldates) 
		{
			String dates= ele.getText();
			System.out.println("Dates are: "+dates);
			
			if(dates.equalsIgnoreCase("22"))
			{
				ele.click();
			}
			
		}

	

	}

}
