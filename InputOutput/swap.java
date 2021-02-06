//Program to show swap of two no’s without using third variable.
import java.util.*;
class swap
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number");
		int n1=sc.nextInt();

		System.out.println("Enter second number");
		int n2=sc.nextInt();

		System.out.println("Before swap \nfirst\t"+n1+"\nsecond\t"+n2);

		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;

		System.out.println("After swap \nfirst\t"+n1+"\nsecond\t"+n2);
	}
}
