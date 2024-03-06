package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Registeruser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 //driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys("admin@email.com");
		 //driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("admin@124");
		 
		 //driver.findElement(By.xpath("//button[contains(text(),\"Sign in\")]")).click();
		driver.findElement(By.linkText("New user? Signup")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("Lalit Mali");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("lalit@email.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("lalit@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[2]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[3]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[4]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[5]")).click();
		driver.findElement(By.xpath("//div[contains(@class,\"interests-div\")]/div[8]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"genders-div\"]/div[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement State= driver.findElement(By.id("state"));
		Select st= new Select(State);
		st.selectByVisibleText("Maharashtra");
	
		
		Thread.sleep(2000);
		
		WebElement hobbies= driver.findElement(By.id("hobbies"));
		Select hb= new Select(hobbies);
		hb.selectByVisibleText("Playing");
		hb.selectByVisibleText("Swimming");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Sign up\"]")).click();
		
		
		

	}

}
