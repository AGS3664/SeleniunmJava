package day31_SeleniumHierarchi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;

public class SeleniumHierarchi2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://freelance-learn-automation.vercel.app");
		//driver.get("http://www.google.com");
		driver.get("https://www.selenium.dev/");
		
		//Method chaining
		//Given below are Manage commands
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		Options opt= driver.manage();
		Window win = opt.window();
		win.maximize();
		
		driver.quit();
	}

}
