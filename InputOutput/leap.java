//Program to find that entered year is leap year or not.
import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int n=sc.nextInt();
		if(n/100==0 || n%400==0)
		{
			System.out.println("leap");
		}
		else if(n/10==0 || n%4==0)
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not leap");	
		}
	}
}
