//Program to reverse a given number.
import java.io.*;
import java.util.*;
class reverse
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number\t");
		int n=Integer.parseInt(br.readLine());
		int t,r=0;
		while(n>=1)
		{
			t=n%10;	
			r=r*10+t;
			n=n/10;
		}
		System.out.println(r);
	}
}
