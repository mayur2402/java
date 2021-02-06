import java.util.*;
public class age
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,n,max=0,min=0;	
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of family member\t");		
		n=sc.nextInt();
		System.out.println("\nEnter age\t");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("\nAge is\n");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			min=a[i];
		
			if(a[i]>max)
			max=a[i];	
		}
		System.out.println("\nmin age\t"+min+"\nmax age\t"+max);
	}
}
