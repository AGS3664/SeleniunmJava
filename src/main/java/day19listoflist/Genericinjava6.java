package day19listoflist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Genericinjava6 {

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
	//way1
		name.addAll(apitool);
		System.out.println(name);
	}

}
