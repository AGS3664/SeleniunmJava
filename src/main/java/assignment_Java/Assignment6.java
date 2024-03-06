package assignment_Java;

public class Assignment6 {

	public static void main(String[] args) {
	/*Write a Java program that uses a while loop to print the first 10 positive integers. */
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int temp=0;
		while(i<10)
		{
			if(arr[i]<11)
			{
				temp=arr[i];
			}
			
		System.out.println(temp);
		i++;
					
		}
	
		
		
	}
				
}
