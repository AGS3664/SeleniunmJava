package assignment_Java;

public class Assignment10 {

	public static void main(String[] args) {
	/*Write a Java program that takes an integer array as input and find 
	 * the duplicates in the array.
		Input : a[] = { 2,3,4,5,2,4,5,7,8}
		Output : 2,4,5 The occurrence of 2 ,4 and 5 is more than 1 time.*/
	
		
		int j=0;
		
		int a[]= {2,3,4,5,2,4,5,7,8};
		
		int i=0;
		for(i=0;i<a.length-1;i++)
		{
			
			
			for(j=i+1;j<a.length-1;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println("Value is not unique"+a[j]);	
				}
			}	
			
		}
		
	}				
}
