package assignment_Java;

public class Assignment9 {

	public static void main(String[] args) {
	/*Write a Java program that searches for a specific element in an integer array.
      The program should have the following features: 
      Create an integer array with elements of your choice.
      Store  a value to search for.
      Check if the entered value exists in the array. Print a message indicating whether the value is found or not.*/
	
	int arr[]= {11,22,33,44,55,66,77};	
	int search=57;	
	boolean found=false;
	for (int i : arr) 
	{
		System.out.println("Values in Arrays are " +i);
		if(i==search)
		{
			found=true;
		}			
	}
	if(found)
	{
		System.out.println("Value Found");
	}
	else {
		System.out.println("Value not Found");
	}
	}				
}
