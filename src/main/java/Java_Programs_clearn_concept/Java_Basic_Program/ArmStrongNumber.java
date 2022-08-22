package Java_Programs_clearn_concept.Java_Basic_Program;

public class ArmStrongNumber {

	
	public static void armStronmg(int number)
	{
		String strNumber= Integer.toString(number);
		double result=0,temp=0;
		for(int i=0;i<strNumber.length();i++)
		{
		
			result=result+Math.pow(Integer.parseInt(String.valueOf(strNumber.charAt(i))),strNumber.length());
			
		}
		
		
	System.out.println(((int)result==number)?"Armstrong":"Not Armstrong ");
		
		
	}
	
	public static void main(String[] args) {
		armStronmg(153);
	}
}
