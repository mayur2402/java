import java.io.*;
import java.net.*;
class Client1
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localhost",2000);

		System.out.println("Client connected to server");

		InputStreamReader ISR1 = new InputStreamReader(System.in);
		InputStreamReader ISR2 = new InputStreamReader(s.getInputStream());

		BufferedReader  br1 = new BufferedReader(ISR1);
		BufferedReader  br2 = new BufferedReader(ISR2);

		DataOutputStream d1 = new DataOutputStream(s.getOutputStream());

		String str1 = null;
		String str2 = null;

		while(!(str1= br1.readLine()).equals("exit"))
		{
			d1.writeBytes(str1 + "\n");
			str2 = br2.readLine();
			System.out.println(str2);			
		}
		d1.close();
		br1.close();
		br2.close();
	}
}
