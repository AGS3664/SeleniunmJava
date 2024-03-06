package day32_WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		WebElement username=driver.findElement(By.id("email1"));
		username.sendKeys("admin@email.com");
		username.clear();
		username.sendKeys("mukesh@email.com");
		System.out.println("Email ID is"+username);
		
		boolean usernamedisplayed=  username.isDisplayed();
		if (usernamedisplayed) 
		{
		System.out.println("Validation 1- Pass");	
		}
		else {
			
			System.out.println("Validation 1- Fail");
		}
		
		boolean usernameEnabled= username.isEnabled();
		
		if(usernameEnabled)
		{
			System.out.println("Validation 2- Pass");
		}
		else {
			
			System.out.println("Validation 2- Fail");
		}
		
		boolean usernameSelected= username.isSelected();
		
		if (!usernameSelected) {
			
			System.out.println("Validation 3- Pass");
		}
		else {
			System.out.println("Validation 3- Fail");
		}
		
	driver.quit();	

	}

}
