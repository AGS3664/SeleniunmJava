package assignment_Java;

public class Assignment5 {

	public static void main(String[] args) {
	/*Write a program to input electricity unit charges and calculate total electricity 
	 * bill according to the given condition:
      	For first 0 - 50 units Rs. 0.50/unit
		For 51-100 units Rs. 0.75/unit
		For 101- 150 units Rs. 1.20/unit
		For unit above 150 Rs. 1.50/unit
		Input : Electricity units consumed - 86 Bill - 64.5 */	
	
		int units=670;
		
		if(units>0 && units<50)
		{ 
			double Bill=units*0.5;
			System.out.println("Electricity units consumed " +units + " " + "Bill " +Bill );
			
		}
		else if(units>50 && units<100)
		{
			double Bill=units*0.75;
			System.out.println("Electricity units consumed " +units + " "+ "Bill " +Bill );
			
		}
		else if (units>100 && units>=150) {
			double Bill=units*1.20;
			System.out.println("Electricity units consumed " +units + " "+ "Bill " +Bill );
		}
		else {
			double Bill=units*1.50;
			System.out.println("Electricity units consumed " +units + " "+ "Bill " +Bill );
			
		}
		
		
	}
				
}
