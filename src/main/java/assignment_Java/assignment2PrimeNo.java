package assignment_Java;

public class assignment2PrimeNo {

	public static void main(String[] args) {
		int start = 2;
		int end = 10;
		int check= 0 ;
		 System.out.println("---Prime Numbers from 1 to 100---");
		for (int i=start ; i<=end ; i++)
		{
			check= 0 ;
			for(int j=2; j<i ; j++)	
			{
				
			if(i%j==0)
				{
					check++;
					
				}
		
				}
				
			if (check==0)
			{
		      System.out.println(i);
			}

		}

	}

}
