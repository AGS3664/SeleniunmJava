package array2;

public class Arraywithforeachloop3 {

	public static void main(String[] args) {
		//WAP double array with for each loop and print the largest values in Array
		
		/*
		 * for(datatype variable:arrayname)
		 * {
		 * }
		 */
		
		double arr[] = {12.5,-22.7,32.4,424.0,52.2,54.7};
		
		double largestvalue=arr[0];
		
		for (double x : arr) 
		{
			
			if(largestvalue<x)
				
			{
				largestvalue=x;
			}
			
		}
		System.out.println(largestvalue);

	}

}
