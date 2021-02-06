import java.io.*;
import java.util.*;
class Arithmetic
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter two numbers\t");
		String n=br.readLine();
		StringTokenizer st=new StringTokenizer(n," ");
		String s1=st.nextToken();
		String s2=st.nextToken();
		int i=Integer.parseInt(s1);
		int ii=Integer.parseInt(s2);
		System.out.println("Addition is\t"+(i+ii));
		System.out.println("Substraction is\t"+(i-ii));
		System.out.println("Multiplication is\t"+(i*ii));
		System.out.println("Division is\t"+(i/ii));
	}
}
