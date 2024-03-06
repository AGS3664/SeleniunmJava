package assignment_Java;

public class Assignment3_1 {

	public static void main(String[] args) {
		/* 1.Write a Java program that takes three numbers from the user and 
		 * prints the greatest number.Use nested if.
			Test Data Input the 1st number: 25
			Input the 2nd number: 78 
			Input the 3rd number: 87
			Expected Output : The greatest: 87 */
		
		int a=25;
		int b=78;
		int c=87; 
		 if(a>b && a>c)
		 {
			 System.out.println("The Gratest number is "+a);
		 }
		 
		 else if (b>a && b>c)
		 {
			 System.out.println("The Gratest Number is "+b);
			 
		}
		 else if (c>a && c>b)
		 {
			
			 System.out.println("The Gratest Number is "+c);
		}
	
	
	}

}
