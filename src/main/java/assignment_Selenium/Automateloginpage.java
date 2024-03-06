package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automateloginpage {

	public static void main(String[] args) throws InterruptedException {
		
/*Open https://freelance-learn-automation.vercel.app/login
Validate url should contains "login"
Validate title should contains "Automation"
Enter email as "admin@email.com" and password as "admin@123"
Click on login button
After login verify "Manage" button is present
Note- Login might take few seconds so please use thread.sleep() as of now. Later on we will replace with waits.*/

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		//maximize the window
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("login"))
		{
			System.out.println("Validation 1 Pass - URL contains Login");
		}
		else 	
		{
			System.out.println("Validation 1 Fail - URL doesnot contains Login");
		}
		
		String title = driver.getTitle();
		
		if(title.contains("Automation"))
		{
			System.out.println("Validation 2 Pass- Title conatins Automation");
		}
		else
		{
			System.out.println("Validation 2 Pass- Title does not conatins Automation");
		}
		
		//Enter User name
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys("admin@email.com");
		
		//Enter Password
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Password')]")).sendKeys("admin@123");
		
		//Click on Login 
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		Thread.sleep(5000);
		
		WebElement mng= driver.findElement(By.xpath("//span[contains(text(),'Manage')]"));
		
		String txt= mng.getAccessibleName();
		System.out.println(txt);
		
		if (mng.isDisplayed()) 
		{
			System.out.println("Validation 3 Pass - Manage button displayed");
		}
		else 
		{
			System.out.println("Validation 3 Fail - Manage button not displayed");	
		}
		
		driver.quit();
		
	}

}
