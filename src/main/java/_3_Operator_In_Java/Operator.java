package _3_Operator_In_Java;

/*

Operator in java is a symbole that is used to perform  opeation 

There are many types of operators in java which are below

Unary Operator 
Arithmetic Operator
shift Operator
assignment Operator
bitwise Operator
logical Operator
Ternary Operator
assignment Operator


Operator Type	  									Category												Precedence

Unary												postfix													expr++  expr--
													prefix											++expr --expr +expr -expr ~ !

Arithmetic										 multiplicative													* / %
													additive													+ -
													
Shift												shift												 	<< >> >>>

Relational											comparison											< > <= >= instanceof
													equality													== !=
													
Bitwise											  bitwise AND													  &
											bitwise exclusive OR												  ^
											bitwise inclusive OR												  |
											
Logical											logical AND														  &&
												logical OR														  ||
												
Ternary												ternary														 ? :

Assignment										assignment											= += -= *= /= %= &= ^= |= <<= >>= >>>=



 */
public class Operator{
	
	
	
	public void operator()
	{//Unary
		int a=10;
		int b=20;
		//postfix
			
		System.out.println(a++);
		System.out.println(a--);
		
		//prefix

		System.out.println(--a);
		System.out.println(++a);
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(!true);
		
		
		// unary operator require only one operand
		
		
		
		
		// arithmatic Operator
		
		System.out.println(
				
				(a+b)+" \t"+
				(a-b)+"\t"+
				(a*b)+"\t"+
				(a/b)+"\t"+
				(a%b)+"\t"
						
				
				);
		
		
		
		//shift operator

		System.out.println(
				"shift operator \n"+
				(a>>b)+" \t"+
				(a<<b)+"\t"+
				(a>>>b)
						
				
				);
		
		//logical operator
		//The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.The bitwise & operator always checks both conditions whether first condition is true or false.
		System.out.println(
				" logical operator \n"+
				(a<b&&b>a)+" \t"+
				(a<b&b<a)+"\t"
			
						
				
				);
		
		System.out.println(
				"relational operator \n"+
				(a>b)+" \t"+
				(a<b)+"\t"+
				(a<b)+"\t"+
				(a>b)+"\t"+
				(a==b)+"\t"+		
				(a!=b)
				);
		System.out.println(
				"relational operator \n"+
				(a>b)+" \t"+
				(a<b)+"\t"+
				(a<b)+"\t"+
				(a>b)+"\t"+
				(a==b)+"\t"+		
				(a!=b)
				);
		
		
		System.out.println(
				"Ternary operator \n"+
				((a<b)?a:b)
				
				);
		
		System.out.println(
				"Assignment operator \n"+
				(a=b)+" \t"+
				(a+=b)+"\t"+
				(a-b)+"\t"+
				(a*=b)+"\t"+
				(a/=b)+"\t"+		
				(a%=b)
				);
		
	}
	
	
	
	
	
	
	
	
	
}
