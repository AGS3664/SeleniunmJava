package assignment_Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_User_BO {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		String url= driver.getCurrentUrl();
		
		if(url.contains("login"))
		{
			System.out.println("Validation 1 Pass : Url contains login");
		}
		else
		{
			System.out.println("Validation 1 Fail : Url does not contains login");	
		}
		
		driver.findElement(By.xpath("//button[contains(text(),\"Sign in\")]")).click();
		WebElement error= driver.findElement(By.xpath("//h2[contains(text(),\"Email and Password is required\")]"));
		
		String ErrorMessage= error.getText();
		if (ErrorMessage.equalsIgnoreCase("Email and Password is required")) 
		{
			System.out.println("Validation 2 Pass : Error message displayed as: "+ErrorMessage);
			
		}
		else 
		{
			System.out.println("Validation 2 Fail ");
		}
		
		driver.findElement(By.partialLinkText("New user")).click();
		Thread.sleep(10000);
		
		String signupUrl= driver.getCurrentUrl();
		
		if (signupUrl.contains("signup")) 
		{
			System.out.println("Validation 3 Pass ");
		}
		else 
		{
			System.out.println("Validation 3 Fail ");
		}
		
		WebElement btnSignup = driver.findElement(By.xpath("//button[text()=\"Sign up\"]"));
		
		if (!btnSignup.isEnabled())
		{
			System.out.println("Validation 4 Pass: Signup button is disable");
		}
		else 
		{
			System.out.println("Validation 4 Fail: Signup button is Enable");
		}
		
		String UserEmail="lalit@email.com";
		String UserPassword ="lalit@123";
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Name\")]")).sendKeys("Lalit Mali");
		
		driver.findElement(By.id("email")).sendKeys(UserEmail);
		driver.findElement(By.xpath("//input[@Placeholder=\"Password\"]")).sendKeys(UserPassword);
		
		driver.findElement(By.xpath("//div[@class=\"interests-div\"]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//div[@class=\"interests-div\"]/div[2]/div/input")).click();
		driver.findElement(By.xpath("//div[@class=\"interests-div\"]/div[3]/div/input")).click();
		driver.findElement(By.xpath("//div[@class=\"interests-div\"]/div[5]/div/input")).click();
		driver.findElement(By.xpath("//div[@class=\"interests-div\"]/div[8]/div/input")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
		WebElement State= driver.findElement(By.id("state"));
	
	 Select St = new Select(State);
	 St.selectByVisibleText("Maharashtra");
	
	WebElement hobbies= driver.findElement(By.id("hobbies"));
	Select hb=new Select(hobbies);
	hb.selectByVisibleText("Playing");
	hb.selectByVisibleText("Swimming");
	
	WebElement btnSignup1= driver.findElement(By.xpath("//button[contains(text(),\"Sign up\")]"));
	if (btnSignup1.isEnabled())
	{
		System.out.println("Validation 5 Pass, Sign up Button Enable ");	
	}
	else
	{
		System.out.println("Validation 5 Fail, Sign up Button Disable ");	
	}
	
	Thread.sleep(5000);
	btnSignup1.click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys(UserEmail);
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Password\"]")).sendKeys(UserPassword);
	driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
	Thread.sleep(5000);
	
	}

}
