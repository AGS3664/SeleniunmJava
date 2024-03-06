package day20Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set_SettoArraylist {

	public static void main(String[] args) {
		
	Set<String> st = new HashSet<String>();
	
	st.add("Selenium");
	st.add("Selenium");
	st.add("Java");
	st.add("Maven");
	st.add("Selenium");
	

	//Insertion order not maintain.
	//Duplicates not allowed
	//
	
	System.out.println(st);
	
	for (String str : st) 
	{
		System.out.println(str);
	}
	
	/*ArrayList<String> lst =new ArrayList<String>(st);
	
	System.out.println(lst);*/
	ArrayList<String> lst =new ArrayList<String>();
	lst.addAll(st);
	System.out.println(lst);

	
	}

}
