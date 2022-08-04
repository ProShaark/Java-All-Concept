package _5_java_control_Statement;
/*
Decision making Statement

1:- if statement
2:- switch statement






*/


public class DecisionMakingStatement {

	public static void ifStatement()
	{
		/*
		 		4 types of if statement
		 		- Simple if 
		 		- if -else
		 		- if-else-if
		 		- nested if
		 		
		 		
		 		
		 		
		 		
		 		
		 */
		
		
		// simple if

		if(true)
		{
			System.out.println("simple if statement");
		}
		
		// if-else
		
		if(false)
		{
			System.out.println("if statement");
		}
		else
		{
			System.out.println("else block");
		}

		//if-else-if

		if(false)
		{
			System.out.println("if statement");
		}
		else
		{
			System.out.println("else block");
		}

		if(true)
		{
			System.out.println("simple if statement");
		}
		
		
		//nested if-else
		if(true)
		{
			if(false)
			{
				System.out.println("if statement");
			}
			else
			{
				System.out.println("else block");
			}
		}
		else
		{
			System.out.println("else block");
		}

	}



	public static void switchMethod()
	{

		
	switch ("a") {
	case "a":
		System.out.println("a case");
		break;
	case "b":
		System.out.println("b case");
		break;
	default:
		System.out.println("default case");
		break;
	}

	}







		
		public static void main(String[] args) {
			ifStatement();
			switchMethod();
		}
	
	
	
}
