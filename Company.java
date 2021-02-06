import java.util.*;
import java.io.*;
class Company
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] quantity=new int[5];
		int[] rate=new int[5];
		int price=0,total=0,i=0;
		String[] code=new String[5];
		for(i=0;i<4;i++)
		{
			System.out.println("\nEnter code of "+ (i+1) +" item");
			code[i]=sc.next();
			System.out.println("\nEnter quantity of "+(i+1)+" item");
			quantity[i]=sc.nextInt();
			System.out.println("\nEnter rate of "+ (i+1) +" item");
			rate[i]=sc.nextInt();
		}
		System.out.println("\n-------------------------------------");
		System.out.println("\nCode\tQuantity\tRate\tPrice");
		System.out.println("\n-------------------------------------");
		for(i=0;i<4;i++)
		{
			price=quantity[i]*rate[i];
			System.out.println("\n"+code[i]+"\t"+quantity[i]+"\t\t"+rate[i]+"\t"+price);
			total=total+price;
		}
		System.out.println("\n-------------------------------------");
		System.out.println("\n\tTotal="+total);
		System.out.println("\n-------------------------------------");
	}
}
