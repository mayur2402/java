import java.io.*;
class marks
{
	public static void main(String args[]) throws IOException
	{
		int i,tot=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nHow many subject\t");
		int s=Integer.parseInt(br.readLine());
		int[] m=new int[s];
		for(i=0;i<s;i++)
		{
			System.out.print("\nEnter the marks\t:");
			m[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<s;i++)
		{
			tot=tot+m[i];
		}
		System.out.println("Total is"+tot);
		System.out.println("Percentage is "+(float)(tot/s));
	}
}
