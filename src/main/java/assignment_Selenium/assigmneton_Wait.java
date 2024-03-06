package assignment_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.UtilityL;

public class assigmneton_Wait {

	public static void main(String[] args) {
		
		WebDriver driver=UtilityL.startBrowser("https://freelance-learn-automation.vercel.app/login");
	//List<WebElement> ele=	 driver.findElements(By.xpath("//div[@class='social-btns']//a"));
	//int elesize= ele.size();
	//System.out.println("Number of Social Media Buttton"+elesize);
		
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(0));
		List<WebElement> ele = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='social-btns']//a")));
		
		int elesize =ele.size();
		System.out.println(elesize);
		ele.get(0).click();
		
		
		

	}

}
