package Java_Programs_clearn_concept.Java_Basic_Program;

public class PrimeNumber {

	public static void primenumber(int number)
	{ 
		if((number==0)||( number==1))
		{
			System.out.println("number is not prime");
			return;
		}
		else
		{
			
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					System.out.println("Not Prime");
					return;
				}
			}
			System.out.println("Prime number");
			
			
		}
		
		

		

		
	}
	public static void main(String[] args) {
		
	primenumber(0);
	

	
	
	
	
	
	
	}
}
