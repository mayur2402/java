import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String arr[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(4444);
		System.out.println("Server Started");
		Socket s = ss.accept();
		System.out.println("Connected to client");
	}
}
