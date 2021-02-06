import java.io.*;
import java.util.*;
class Tokenizer
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter id,name,salary separate by ','\t");
		String str=br.readLine();

		StringTokenizer st=new StringTokenizer(str,",");

		String st1=st.nextToken();
		String st2=st.nextToken();
		String st3=st.nextToken();
		
		int i=Integer.parseInt(st1);
		String n=st2;
		int s=Integer.parseInt(st3);

		System.out.println("ID is\t"+i);
		System.out.println("Name is\t"+n);
		System.out.println("Salary is\t"+s);
	}
}
