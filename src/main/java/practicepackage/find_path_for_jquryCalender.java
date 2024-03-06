package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_path_for_jquryCalender {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		List<WebElement> list1=driver.findElements(By.xpath("//input[@placeholder=\"From\"]"));
		list1.get(0);
		

	}

}
