import java.io.*;
class singlechar
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("\nEnter a character\t:");
		char ch=(char)br.read();
		System.out.println("\nYou entered\t:"+ch);
	}
}
