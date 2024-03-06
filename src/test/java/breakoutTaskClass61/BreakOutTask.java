package breakoutTaskClass61;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import helper.UtilityL;

public class BreakOutTask 
{
	WebDriver driver;
	
	@Parameters("BrowswerName")
	@BeforeMethod
	public void setUp(@Optional("Chrome") String browser)
	{
		driver=UtilityL.startBrowser(browser, "https://freelance-learn-automation.vercel.app/signup");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyUrl()
	{
		SoftAssert softAssert=new SoftAssert();
		
		String URL=driver.getCurrentUrl();
		
		softAssert.assertTrue(URL.contains("signup"), "URL does not contain signup text");
		
		softAssert.assertAll();
		
	}
	
	@Test(priority=2)
	public void signUpButtonDisabled()
	{
		SoftAssert softAssert=new SoftAssert();
		
		WebElement signUpButton=driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		
		softAssert.assertFalse(signUpButton.isEnabled(), " Sign up Button is disabled");
		
		softAssert.assertAll();
	}
	
	@Test(dataProvider="TestData",dataProviderClass = CustomDataProvider.class, priority=3)
	public void signUpPage(String userName, String emailId, String password, String interest, String genderInput, String state, String hobbies)
	{
		WebElement nameInput=driver.findElement(By.xpath("//input[@id='name']"));
		nameInput.sendKeys(userName);
		
		WebElement emailInput=driver.findElement(By.xpath("//input[@id='email']"));
		//int data=new Faker().number().randomDigit();
		long data=new Faker().number().randomNumber();
		String []arr=emailId.split("@");
		System.out.println("New Email "+arr[0]+String.valueOf(data)+"@"+arr[1]);
		
		emailInput.sendKeys(arr[0]+String.valueOf(data)+"@"+arr[1]);
		
		WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
		passwordInput.sendKeys(password);
		
		/*
		 * WebElement interestCheckbox=driver.findElement(By.xpath(
		 * "//label[normalize-space()='Playwright']")); interestCheckbox.click();
		 * 
		 * WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
		 * gender.click();
		 */
		try 
        {
        	WebElement interestCheckbox = driver.findElement(By.xpath("//label[normalize-space()='" + interest + "']"));
            interestCheckbox.click();	
		} 
        catch (Exception e)
        {
        	Assert.fail("Step Failed: Interests named " + interest + " is not available");
		}
        
        WebElement radioButton=driver.findElement(By.xpath("//input[@value='"+genderInput+"']"));
        radioButton.click();
        UtilityL.AssertTrueOrFalse(radioButton.isSelected(), "Radio button is selected", "Radio button is not selected");
		Select states = new Select(driver.findElement(By.id("state")));
		
		states.selectByVisibleText(state);
		
		Select hobbiesList = new Select(driver.findElement(By.id("hobbies")));
		
		hobbiesList.selectByVisibleText(hobbies);
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		
		WebElement loginSuccessMessage=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Signup successfully, Please login!')]")));
		
		//WebElement loginSuccessMessage=driver.findElement(By.xpath("//div[contains(text(),'Signup successfully, Please login!')]"));	
		
		Assert.assertTrue(loginSuccessMessage.isDisplayed(), "Signup Failed, Please try again!");
		
		
	}	

}
