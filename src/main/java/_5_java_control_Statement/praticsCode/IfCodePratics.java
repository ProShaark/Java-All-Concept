package _5_java_control_Statement.praticsCode;

import java.util.Scanner;

public class IfCodePratics {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void example1()
	{
		
		
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		if(age >18)
		{
			System.out.println("age is greate than 18 and your Enter age is -" + age);
		}
		
	}
	
	
	
	
	
	
	//-------------------------------------------------------
	
	public static void example2()
	{
		System.out.println("Enter your number");
		int number=scanner.nextInt();
		if(number%2==0)
		{
			System.out.println("number are even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
	}
	
	//-----------------------------------------------------------
	
	
	public static void example3()
	{
		System.out.println("Enter your number");
		int year=scanner.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("yearn is leap");
		}
		else
		{
			System.out.println("year is not leeap");
		}
	}
	
	
	//------------------------------------------------------------------
	
	
	// we can use ternary operatore insted by if..else
	
	public static void example4()
	{
		int number=20;
		String output=(number%2==0)?"Even number":"Odd Number";
		System.out.println(output);
	}
	
	public static void postaiveNegativeguster()
	{
		
		int number=10;
		if(number>0)
			System.out.println("Positive");
		else if(number<0)
			System.out.println("negative");
		else
			System.out.println("zero");
		
	}
	
	public static void JavaNestedIfExample()
	{
		int age=20;
		int weight=0;
	
		if(age>=18)
		{
			if(weight>=80)
			{
				System.out.println("you can Donate blood");
				return;
			}
			System.out.println("You can't donate blood");
		}
	}
	
	
	
	public static void main(String[] args) {
		//example1();
		// example2();
		 //example3();
		// example4();
		//postaiveNegativeguster();
		JavaNestedIfExample();
	}
	
	
	
	
	
	
	
	
	
	
	
}
