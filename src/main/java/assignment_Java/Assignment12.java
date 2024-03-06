package assignment_Java;

public class Assignment12 {

	public static void main(String[] args) {
		/*Write a Java program that takes a string as input and prints its reverse.*/
	
		String str="Selenium";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			System.out.println(c);
			
		}
		
		
	}				
}
