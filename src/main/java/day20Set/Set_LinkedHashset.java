package day20Set;

import java.util.LinkedHashSet;

public class Set_LinkedHashset {

	public static void main(String[] args) {
		
	LinkedHashSet<String> lhs1=new LinkedHashSet<String>();
	
	lhs1.add("Selenium");
	lhs1.add("Selenium");
	lhs1.add("Java");
	lhs1.add("Maven");
	lhs1.add("Selenium");
	

	//Insertion order maintain.
	//Duplicates not allowed
	
	System.out.println(lhs1);
	
	for (String str : lhs1) 
	{
		System.out.println(str);
	}
	
	}

}
