import java.io.*;
class integer
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("\nEnter integer");
		int i=Integer.parseInt(br.readLine());
		System.out.println("\nInteger is\t"+i);
	}
}
