import java.util.*;
class mathsoperatio
{
	static int a;
	static int b;
	static int c;
	static void maths()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter three numbers\t:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Max");		
		if(a>b && a>c)
		{
			System.out.println("\nMaximum is\t:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("\nMaximum is\t:"+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("\nMaximum is\t:"+c);
		}
		System.out.println("Min");
		if(a<b && a<c)
		{
			System.out.println("\nMinimum is\t:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("\nMinimum is\t:"+b);
		}
		else
		{
			System.out.println("\nMinimum is\t:"+c);
		}
		
	}
}
class mathoperation
{
	public static void main(String args[])
	{
		mathsoperatio.maths();	
	}
}
