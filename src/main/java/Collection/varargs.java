package Collection;

public class varargs {

	public static void main(String[] args) {
		 
		sum(10,20,30);

	}
	
	public static void sum(int ...var)
	{
		for (int value: var) 
		{
			
			System.out.println(value);
			
		}
		
		
	}

}
