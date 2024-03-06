package day44_ExplicitwaitinSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.UtilityL;

public class ExplicitWaitInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= UtilityL.startBrowser("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
	Alert alt=	wait.until(ExpectedConditions.alertIsPresent());
	if(alt.getText().contains("Selenium"))
	{
		System.out.println("Test Validated");
	}
	else {
		System.out.println("Test not Validated-Failed");
	}
		
	alt.accept();
		driver.quit();

	}

}
