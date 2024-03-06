package assignment_Java;

public class assignment2Primeornot {

	public static void main(String[] args) {
		int i = 0;
		int check = 0;
		int Num = 9;
		for(i=2;i<Num;i++)
		{
	if (Num%i==0) 
	{
		check++;
	}
		
		}	
	
	if (check==0)
	{
		System.out.println("Number is Prime "+i);
	}
	else {
		System.out.println("Number is not Prime " +i);
	}
	}
	}

