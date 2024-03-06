package day19listoflist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Genericinjava8 {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>();
		name.add("Selenium");
		name.add("Cypress");
		name.add("Playwright");
		
		
		List<String> apitool=new ArrayList<String>();
		apitool.add("Postman");
		apitool.add("RestAssure");
		apitool.add("Katlon");
		apitool.add("JMeter");
		apitool.add("SoapUI");
		apitool.add("Karete");
		apitool.add("Katalium");
		
		System.out.println(name);
		System.out.println(apitool);
	//way3- WAP add only values start with K and add them in name List
		for (String str : apitool) 
		{
			if (str.startsWith("K")) {
				name.add(str);
			}
			
		}
		System.out.println(name);
	}

}
