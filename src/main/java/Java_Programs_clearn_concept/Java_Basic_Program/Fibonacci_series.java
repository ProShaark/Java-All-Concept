package Java_Programs_clearn_concept.Java_Basic_Program;

public class Fibonacci_series {

	
	
	public static void FibonacciWithoutRecursion()
	{
	
		int n0=0,n1=1,n3,i,count=10;
		System.out.println(n0+"\n "+n1);
		for(i=2;i<=count;i++)
		{
			n3=n1+n0;
			System.out.println(n3);
			n0=n1;
			n1=n3;
		}
		
		
		
		
	}
	
	static int n0=0,n1=1,n2=0;
	// recursion means calling function to him self
	public static void FibonacciRecursion(int count)
	{
		if(count>0)
		{
			n2=n0+n1;
			
			n0=n1;
			n1=n2;
			System.out.println(n2);
			FibonacciRecursion(count-1);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//FibonacciWithoutRecursion();
		int count=10;
		System.out.println(n0+" "+n1);
		FibonacciRecursion(count-2);
		
	}
}
