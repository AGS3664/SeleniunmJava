package assignment_Java;

public class primeno1to100 {

	public static void main(String[] args) {

		int i = 0;
		
		
		for (i = 2;i<=100;i++)
		{
			int chk =0;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					chk++;
				}
				
				
			}
			if (chk==0)
			{
			System.out.println("Prime Number is "+i);
			
			}
			
			
		}
		

	}

}
