package day21MAP;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
	
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("Name1", "Lalit");
		hm.put("Name2", "Daksh");
		hm.put("Name3", "Lalit");
		hm.put(null, null);
		
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("Course1", "Selenium");
		hm1.put("Course2", "Java");
		hm1.put("Course3", "Maven");
		hm1.put(null, null);
		
		HashMap<String, String> hm2=new HashMap<String, String>();
		hm2.put("Lname1", "Mali");
		hm2.put("LName2", "Chaudhari");
		hm2.put("LName3", "Patil");
		hm2.put(null, null);
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		System.out.println(hm1.size());
		System.out.println(hm1);
		
		System.out.println(hm2.size());
		System.out.println(hm2);

	}

}
