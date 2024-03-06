package day32_WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElementCommand2 {

	public static void main(String[] args) {
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username= driver1.findElement(By.id("email1"));
	
		String usernameplaceholder=	username.getAttribute("placeholder");
		System.out.println("Place Holder is "+usernameplaceholder);
	
	if(usernameplaceholder.equals("Enter Email"))
	{
		System.out.println("Vaidation 1 - Pass");
	}
	
	else  {
		System.out.println("Vaidation 1 - Fail");
	}
		
 String usernamecssvalue=	username.getCssValue("border");
 System.out.println("css value is "+usernamecssvalue);
 
 if(usernamecssvalue.contains("2px"))
	{
		System.out.println("Vaidation 2 - Pass");
	}
	
	else  {
		System.out.println("Vaidation 2 - Fail");
	}
	
	driver1.quit();

	}
	
	

}
