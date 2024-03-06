package assignment_Java;

public class Assignment7 {

	public static void main(String[] args) {
	/*Write a Java program that uses a do-while loop to calculate the sum of the first 10 natural numbers.*/
		
		int i=1;
		int sum=0;
		do
		{
			sum=sum+i;
			i++;
		}
		while(i<=10);
			
		System.out.println(sum);
		
		
	}
				
}
