package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iteratorDemo {

	public static void main(String[] args) {
		
		List<String>list1=Arrays.asList("Selenius","Maven","Testng");
		
		Iterator<String> itr = list1.iterator();
		
		while (itr.hasNext()) 
		{
			
			String Value = itr.next();
			System.out.println(Value);
			
		}
		
		

	}

}
