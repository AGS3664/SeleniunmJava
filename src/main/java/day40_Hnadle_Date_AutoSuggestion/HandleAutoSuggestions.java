package day40_Hnadle_Date_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
	Thread.sleep(3000);
	List<WebElement> allsuggetions= driver.findElements(By.xpath("//ul[contains(@class,\"autocomplete \")]//li//div"));
	
	//List<WebElement> allsuggetions= driver.findElements(By.xpath("//ul[contains(@class,\"autocomplete \")]//div"));
	
	for(WebElement ele:allsuggetions)
	{
		String values=ele.getText();
		System.out.println("Values are: "+values);
		
		if(values.equalsIgnoreCase("Java"))
		{
			ele.click();
			break;
		}
	}
	
	

	}

}
