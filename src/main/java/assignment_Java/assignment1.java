package assignment_Java;
public class assignment1 {

	public static void main(String[] args) {
	
		int age = 20;
		String edu = "BTech";
		int percentage = 71;
		boolean offer = false ;
		if(age>=21)
		{
			
			if (edu == "BTech") 
			{
				
				if (percentage>70)
				{
					if (offer) 
					{
						System.out.println("You are on hold. We have received your offer.");	
					}
					else {
						System.out.println("Congratulations! You are selected for an interview.");
					}
				}
				else if (percentage<70) 
				{
					System.out.println("Sorry, your percentage is below 70%. Application rejected.");
				}
					
			}
			else {
				System.out.println("Sorry, we only accept BTech graduates.");
			     }
				
			}
		else {
			System.out.println("Sorry, minimum age to apply is 21.");
		}
			
		}

	}



