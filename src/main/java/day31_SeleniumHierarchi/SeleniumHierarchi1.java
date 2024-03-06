package day31_SeleniumHierarchi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHierarchi1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://freelance-learn-automation.vercel.app");
		driver.get("http://www.google.com");
		driver.get("https://www.selenium.dev/");
		String url =driver.getCurrentUrl();
		System.out.println("Url is " +url);
		String title= driver.getTitle();
		System.out.println("Title is "+title);
		//String PS= driver.getPageSource();
		//System.out.println("Page Source is "+PS);
		
		//it will close all associated window
		//it assign null to session id
		//driver.quit();
		
		//it will close current active window
		//it keep session id as it is but close the window
		driver.close();
		

	}

}
