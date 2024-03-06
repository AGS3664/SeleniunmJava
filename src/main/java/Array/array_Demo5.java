package Array;

public class array_Demo5 {

	public static void main(String[] args) {
		
		//WAP to get the array reference 
		
		int arr[] = new int [5];
		
		arr[0] = 15;
		arr[1] = 25;
		arr[2] = 35;
		arr[3] = 45;
		arr[4] = 55;
		
		System.out.println("start");
		int arr1[]=arr;
		System.out.println(arr1[2]);
		arr[2]=33;
		System.out.println(arr[2]);
		
		System.out.println(arr==arr1);
		
		System.out.println("End");

	}

}
