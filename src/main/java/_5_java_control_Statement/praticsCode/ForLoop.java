package _5_java_control_Statement.praticsCode;

public class ForLoop {

	static void example1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	
	static void example2()
	{
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				System.out.println(i+" \t"+j);
			}
		}
	}
	
	static void PyramidExample()
	{
		for(int i=1;i<=10;i++)
		{for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();//new line 
		}
	}
	
	
	static void RevisedPyramidExample()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=i;j<=10;j++)
		{
			System.out.print("*");
		}
		System.out.println();//new line 
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		RevisedPyramidExample();
		
	}
}
