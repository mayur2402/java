//Program to use switch statement. Display Monday to Sunday.
import java.io.*;
import java.util.*;
class day
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter \nmon for monday \ntue for tuesday \nwed for wednesday \nthur for thursday\nfri for friday \nsat for saturday\nsun for sunday");
	System.out.println("Enter your choice");
	String ch=sc.next();
	switch(ch)
	{
		case mon:
			System.out.println("monday");
			break;
		case tue:
			System.out.println("tuesday");
			break;
		case wed:
			System.out.println("wednesday");
			break;
		case thur:
			System.out.println("thursday");
			break;
		case fri:
			System.out.println("friday");
			break;
		case sat:
			System.out.println("satday");
			break;
		case sun:
			System.out.println("sunday");
			break;
		default :
			System.out.println("Error");
			break;
	}
}
}
