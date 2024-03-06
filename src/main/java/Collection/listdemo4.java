package Collection;

import java.util.ArrayList;

public class listdemo4 {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		boolean Status= list1.add(20);
		list1.add(12.8);
		list1.add('c');
		list1.add(8828019111l);
		list1.add("Lalit");
		list1.add("Dakshata");
		list1.add(0, "Start");
		
		System.out.println(Status);
		System.out.println(list1);
		
		for(Object x : list1)
		{
			System.out.println(x);
		}
		
		

	}

}
