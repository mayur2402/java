import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localHost",4444);
		System.out.println(s.getInetAddress());
		System.out.println(s.getPort());
		System.out.println(s.getLocalPort());
		s.close();
	}
}
