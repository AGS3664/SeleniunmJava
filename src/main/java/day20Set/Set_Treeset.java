package day20Set;

import java.util.TreeSet;

public class Set_Treeset {

	public static void main(String[] args) {
		
	TreeSet<String> ts1=new TreeSet<String>();
	
	ts1.add("Selenium");
	ts1.add("Selenium");
	ts1.add("Java");
	ts1.add("Maven");
	ts1.add("Selenium");
	ts1.add("ABC");
	int sz;
	System.out.println(sz=ts1.size());
	

	//Insertion order maintain.
	//Duplicates not allowed
	
	System.out.println(ts1);
	
	for (String str : ts1) 
	{
		System.out.println(str);
	}
	
	}

}
