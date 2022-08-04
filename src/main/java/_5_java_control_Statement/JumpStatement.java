package _5_java_control_Statement;

/*
 		jump Statement
 		
 		
 		jump statement are used to transfer the control of the specific statement 
 		
 		2 type of jump statement are avalaiabele 
 		
 			1:- Break;
 			2:- Continue;
 			
 		
 */

public class JumpStatement {

	public static void breakJumpStatement()
	{
		/*
		 	BreaK statement is use to break the current flow and transfer the contrrol to the next statement 
		 	outside the outer side loop
		 	
		 	it can only be written inside the loop or switch statement.
		 		
		 */
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		if(i==3)
		{
			break;
		}
		}	
		
		
		
	}
	
	public static void continueDemo()
	{
		/*
		 	unlike break statement, the continue statement doens't break the loop , whereas it skips the specific 
		 	part od the loop jump from the current loop
		 */
		
		
		
		
		System.out.println("\n continue function");
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		if(i==3)
		{
			continue;
		}
		}
	}
	
	public static void main(String[] args) {
	
		breakJumpStatement();
		continueDemo();
	}
	
	
}
