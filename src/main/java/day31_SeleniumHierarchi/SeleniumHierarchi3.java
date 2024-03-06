package day31_SeleniumHierarchi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHierarchi3 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://freelance-learn-automation.vercel.app");
		//driver.get("http://www.google.com");
		driver.get("https://www.selenium.dev/");
		
		//Navigate Commands
		
		driver.navigate().to("http://www.google.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.quit();
	}

}
