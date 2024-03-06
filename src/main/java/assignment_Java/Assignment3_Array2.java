package assignment_Java;

public class Assignment3_Array2 {

	public static void main(String[] args) {
		
		//Create an integer array with elements of your choice.
		
		int arr[]= {10,20,30,40,50};
		int serachnumber=30;
		//Check if the entered value exists in the array.
		//Print a message indicating whether the value is found or not.
/*		for (int x : arr) 
		{
			if(x==30)
			{
				found=true;
				break;
				
				}	
			
		}
		
		if(found)
		{
				System.out.println("Value is found");
				break;
				
				}	
			else {
				System.out.println("Value is not found");
			}*/
		boolean found = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == serachnumber)
			{
				found=true;
				break;
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
