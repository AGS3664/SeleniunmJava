package day21MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class listofmap {

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
		
		List<HashMap<String, String>> ls=new ArrayList<HashMap<String, String>>();
		System.out.println(ls.add(hm));
		System.out.println(ls.add(hm1));
		System.out.println(ls.add(hm2));
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		

	}

}
