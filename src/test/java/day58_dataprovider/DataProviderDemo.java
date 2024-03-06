package day58_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	//Number of rows in array=number of test Method Execution
	@Test(dataProvider ="logintest")
	public void test1(String name,String Pass)
	{
		System.out.println("Test Executed "+name +" "+Pass);
	}
	
	@DataProvider(name="logintest")
	public Object[][] getData()
	{
		System.out.println("Creating Test data");
		Object[][] arr=new Object[2][2];
		arr[0][0]="Lalit";
		arr[0][1]="Mali";
		
		arr[1][0]="Selenium";
		arr[1][1]="Webdriver";
		System.out.println("Test data Created");
		
		return arr;
		
	}

}
