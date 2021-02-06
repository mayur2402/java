//Program to find greatest in 3 numbers.
import java.util.*;
import java.io.*;
class three
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three number");
		String s=br.readLine();

		StringTokenizer st=new StringTokenizer(s," ");

		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();

		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=Integer.parseInt(s3);

		System.out.println("numbers are\t"+n1+" "+n2+" "+n3);

		if(n1 >= n2 && n1 >= n3)
		{
			System.out.println(n1+" is greater");
		}
		else if(n2 >= n1 && n2 >= n3)
		{
			System.out.println(n2+" is greater");
		}
		else
		{
			System.out.println(n3+" is greater");
		}
	}
}
