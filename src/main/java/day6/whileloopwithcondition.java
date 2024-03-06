package day6;

public class whileloopwithcondition {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int num = 50; 
		while(i<=num)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
}
}