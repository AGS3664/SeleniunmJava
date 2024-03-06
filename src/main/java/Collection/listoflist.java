package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listoflist {

	public static void main(String[] args) {
	
		List<String> morningbatch= Arrays.asList("Lalit","Harshal","Rohit");
		List<String> eveningbatch=Arrays.asList("Mukesh","Vinit","Chintu");
		List<String> nightbatch=Arrays.asList("Mahavir","Rakesh","Prashant");
		
		List<List<String>> list1=new ArrayList<List<String>>();
		list1.add(morningbatch);
		list1.add(eveningbatch);
		list1.add(nightbatch);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println(list1.get(0).get(0));

	}

}
