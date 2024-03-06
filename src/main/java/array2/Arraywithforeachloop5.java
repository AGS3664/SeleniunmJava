package array2;

public class Arraywithforeachloop5 {

	public static void main(String[] args) {
		//WAP integer array with copy the array data in another array
		
		/*
		 * for(datatype variable:arrayname)
		 * {
		 * }
		 */
		
		int arr[] = {23,33,56,89,98};
		int arr1[] = new int[arr.length] ;
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		


	}

}
