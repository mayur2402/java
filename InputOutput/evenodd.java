//Program to find whether given no. is even or odd.
import java.io.*;
class evenodd
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int n=Integer.parseInt(br.readLine());
		if(n%2==0)
		{
			System.out.println("even");	
		}
		else
		{
			System.out.println("odd");
		}
	}
}
