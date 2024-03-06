package day19listoflist;

import java.util.ArrayList;

public class Genericinjava4 {

	public static void main(String[] args) {
		Emp emp1=new Emp("Lalit", 88280, true);
		Emp emp2=new Emp("Daksh",19111,true);
		Emp emp3=new Emp("Shiv",988118,true);
		
		ArrayList<Emp> list1 =new ArrayList<Emp>();
		
		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);
		
		System.out.println(list1.get(0).Name);

	}

}
