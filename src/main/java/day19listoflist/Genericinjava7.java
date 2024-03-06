package day19listoflist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Genericinjava7 {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>();
		name.add("Selenium");
		name.add("Cypress");
		name.add("Playwright");
		
		
		List<String> apitool=new ArrayList<String>();
		apitool.add("Postman");
		apitool.add("RestAssure");
		apitool.add("HTTPClient");
		
		System.out.println(name);
		System.out.println(apitool);
	//way2- Pickup values one by one from list and add to another list
		for (String str : apitool) 
		{
			name.add(str);
		}
		System.out.println(name);
	}

}
