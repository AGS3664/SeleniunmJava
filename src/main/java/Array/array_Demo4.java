package Array;

public class array_Demo4 {

	public static void main(String[] args) {
		
		//WAP to get the sum of all numbers in given array
		int sum=0;
		int arr[] = new int [5];
		
		arr[0] = 15;
		arr[1] = 25;
		arr[2] = 35;
		arr[3] = 45;
		arr[4] = 55;
		
		System.out.println("start");
		
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		System.out.println("End");

	}

}
