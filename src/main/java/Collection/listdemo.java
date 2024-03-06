package Collection;

import java.util.ArrayList;

public class listdemo {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		boolean Status= list1.add(20);
		list1.add(12.8);
		list1.add('c');
		list1.add(8828019111l);
		list1.add("Lalit");
		list1.add("Dakshata");
		list1.add(0, "Start");
		
		System.out.println(list1);
		
		int listsize = list1.size();
		
		for(int i=0;i<listsize;i++)
		{
			System.out.println("Object in List is "+list1.get(i));
		}
		
		

	}

}
