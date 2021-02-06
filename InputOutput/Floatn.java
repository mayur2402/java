import java.io.*;
class Floatn
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("\nEnter float number\t");
		float f=Float.parseFloat(br.readLine());
		System.out.println("Flaoting number is\t"+f);
	}
}
