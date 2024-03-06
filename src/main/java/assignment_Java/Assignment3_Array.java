package assignment_Java;

public class Assignment3_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an integer array with elements of your choice.
		
		int arr[]= {10,20,30,40,50};
		int serachnumber=30;
		//Check if the entered value exists in the array.
		//Print a message indicating whether the value is found or not.
/*		for (int x : arr) 
		{
			if(x==30)
			{
				System.out.println("Value is found");
				break;
				
				}	
			else {
				System.out.println("Value is not found");
			}
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == serachnumber)
			{
				System.out.println("Value Found");
				//break;
			}
			else {
				System.out.println("Value not Found");
			}
		}
		

	}

}
