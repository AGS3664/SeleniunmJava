package day45_BreakoutSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.UtilityL;

public class BO_Seesion {

	public static void main(String[] args) {
		
		WebDriver driver= UtilityL.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		
		List<WebElement> courses=driver.findElements(By.xpath("//div[@class='course-card row']"));
		 int Numberofcourse= courses.size();
		System.out.println("Number of Courses: "+Numberofcourse);
		courses.addAll(courses);
		
		if(Numberofcourse>4)
		{
			System.out.println("Number of Courses is Greater than 4- Validaion 1 pass");
		}
		else {
			System.out.println("Number of Courses is not Greater than 4- Validaion 1 failed");
		}
		
			WebElement elePrice1=driver.findElement(By.xpath("//div[@class='course-card row'][1]//h2"));
			
		   String cprice1=elePrice1.getText();
		   int CoursePrice1=Integer.parseInt(cprice1);
		   System.out.println("Cypress Course Price is"+CoursePrice1);
		   
		   driver.findElement(By.xpath("//div[@class='course-card row'][1]//button")).click();
		   
		   WebElement elePrice2=driver.findElement(By.xpath("//div[@class='course-card row'][2]//h2"));
		   String cprice2=elePrice2.getText();
		   int CoursePrice2=Integer.parseInt(cprice2);
		   System.out.println("Cypress Course Price is"+CoursePrice2);
		   driver.findElement(By.xpath("//div[@class='course-card row'][2]//button")).click();
		   
		   String Count = driver.findElement(By.xpath("//span[@class='count']")).getText();
		   System.out.println(Count);
		   
		   if (Count.equals("2")) 
		   {
			  System.out.println("Validation 2 Pass");
			
		   }
		   else {
			   System.out.println("Validation 2 failed");
		}
		   
		   driver.findElement(By.xpath("//span[@class='count']")).click();
		   
		   int CourceTotalPrice= CoursePrice1+CoursePrice2;
				   System.out.println("Total Price for Course is "+CourceTotalPrice);
		   String CartPrice=driver.findElement(By.xpath("//h3[contains(text(),'Total Price:')]")).getText();
		   int FinalCartPrice= Integer.parseInt(CartPrice);
		   System.out.println("Final Cart Price: "+FinalCartPrice);
		   

	}

}
