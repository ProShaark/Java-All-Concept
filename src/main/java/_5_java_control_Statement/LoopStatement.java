package _5_java_control_Statement;

public class LoopStatement {

	/*
	 
	 
	 In program , some times we need to execute the block of code repeatedly whitle some condation evaluteds
	 to true, 
	 loop statement are use executed the set of instruction repeatedly  order.
	 
	  in java have three type of loop thaey have different syntax and condation checking time 
	  
	  
	  1:- for loop
	  2:- while
	  3:- do() while
	  
	  
	 
	 
	 */
	
	
	public static void forLoop()
	{
		/*		Syntax
		 * 
		 * 			for( initialization , condition , increment  decrement  )
		 * 		 	
		 */
		
		int sum =0;
		for(int j=1;j<=10;j++)
		{
			sum=sum+j;
			System.out.println(sum);
		}
		
		
		System.out.println("\n");	
		
		
	}
	int i=0;
	
	public static void forEachLoop()
	{
		// it advance version of the for loop 
		// syntax for( DataType varable : iterable )
		
		int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i:numbers)
		{
			
			System.out.println(i);
		}
		
		
	}
	//-------------------------------------------------------------------------------------------	
	
	
	
	public static void whileLoop()
	{ 
		// if we dont known the iterations in advance that time it use.
		
		
		
		System.out.println("\n whileLoop() " );
		int i=0;
		while(i!=10)
		{
			System.out.println(i);
			i++;
		}
		
		while(true)
		{
			System.err.println(i);
			i++;
			if(i==100)
				break;
		}
	}
	
	
	
	public  void doWhile()
	{
		
		/* WHEN the number of iteration is not known and we ahve to execuit the loop once , we can use do-while loop
		      
		      do
		      {
		      statement
		      }
		      while(condation)
		     
		 */
		System.out.println("\n do while");		
		
		do {
			i=i+2;
			System.out.println(i);
		}
		while(i<=10);
		
		
		
		
		
		
	}
	
//-------------------------------------------------------------------------------------------
	

	
	
	
	
	public static void main(String[] args) {
		
		forLoop();
		forEachLoop();
		whileLoop();
	
		LoopStatement loopStatement = new LoopStatement();
		loopStatement.doWhile();
		
	}
	
	
	
	
	
}
