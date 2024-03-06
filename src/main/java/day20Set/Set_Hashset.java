package day20Set;

import java.util.HashSet;

public class Set_Hashset {

	public static void main(String[] args) {
		
	HashSet<String> hs1=new HashSet<String>();
	
	hs1.add("Selenium");
	hs1.add("Selenium");
	hs1.add("Java");
	hs1.add("Maven");
	hs1.add("Selenium");
	

	//Insertion order not maintain.
	//Duplicates not allowed
	//
	
	System.out.println(hs1);
	
	for (String str : hs1) 
	{
		System.out.println(str);
	}
	
	}

}
