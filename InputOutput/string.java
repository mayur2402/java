import java.io.*;
class string
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("\nEnter String");
		String s=br.readLine();
		System.out.println("\nyou enter\t"+s);
	}
}
