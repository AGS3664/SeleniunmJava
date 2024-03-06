package day58_dataprovider;

import org.testng.annotations.Test;

public class DataProviderDemo2 {
	//Number of rows in array=number of test Method Execution
	@Test(dataProvider ="logintest",dataProviderClass =CustomDataProvider.class )
	public void test1(String name,String Pass)
	{
		System.out.println("Test Executed "+name +" "+Pass);
	}
	
	

}
