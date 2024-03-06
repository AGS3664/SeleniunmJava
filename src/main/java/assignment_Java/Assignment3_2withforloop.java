package assignment_Java;

public class Assignment3_2withforloop {

	public static void main(String[] args) {
		/* 1.Write a Java program that takes three numbers from the user and 
		 * prints the greatest number.Use nested if.
			Test Data Input the 1st number: 25
			Input the 2nd number: 78 
			Input the 3rd number: 87
			Expected Output : The greatest: 87 */
		
		int arr[]= {25,78,87,99};
		int temp=25;
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}	
					
		}	
		System.out.println("gratest value is "+temp); */
		
		for(int x:arr)
		{
			
			if(x >temp)
			{
				temp=x;
			}	
			
		}
		
		System.out.println("gratest value is "+temp);
	}
				
}
