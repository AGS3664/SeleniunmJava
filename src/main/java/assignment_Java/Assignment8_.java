package assignment_Java;

public class Assignment8_ {

	public static void main(String[] args) {
	/*Write a Java program that uses a for loop to print the multiplication table of a given number. Input number is 6.*/
		
		int i=0;
		int j=6;
		int table=0;
		
		System.out.println("Start Table of "+j);
		for (i=1;i<=10;i++)
		{	
			table=j*i;
			System.out.println(table);
		}
		System.out.println("End");
	}
				
}
