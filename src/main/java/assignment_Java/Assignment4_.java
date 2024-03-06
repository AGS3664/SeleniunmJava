package assignment_Java;

public class Assignment4_ {

	public static void main(String[] args) {
	/*Write a program to read a weekday number between 1-7 and print weekday name using 
		switch statement Input: 1 Output: Monday Input : 7 Output: Sunday */	
	int x=5;
	switch (x) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thusrday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;

	default:
		System.out.println("Please enter the valid vlaue between 1 to 7");
		break;
	}
		
		
		
	}
				
}
