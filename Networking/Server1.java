import java.io.*;
import java.net.*;
class Server1
{
	public static void main(String args[])
	{
		try
		{
			//Used to create server that listen for incoming connection from one or more client
			//Bind the server to the 2000 port number
			ServerSocket ss = new ServerSocket(2000);

			//Used to listen socket connection when client comes to port 2000 then connection between
			//client and server established and ss.accept() return object of socket class 
			Socket s = ss.accept();
	
			System.out.println("Client connect");

			//is a stream (pipe) which connect to the input device.
			InputStreamReader ISR1 = new InputStreamReader(System.in);
			InputStreamReader ISR2 = new InputStreamReader(s.getInputStream());

			BufferedReader br1 = new BufferedReader(ISR1);
			BufferedReader br2 = new BufferedReader(ISR2);
	
			PrintStream ps = new PrintStream(s.getOutputStream());
	
			while(true)
			{
				String str1 = null;
				String str2 = null;

				//execute till client break connection with server
				while((str2 = br2.readLine()) != null)
				{
					//print on console what client send
					System.out.println(str2);
					//accept from terminal
					str1 = br1.readLine();
					ps.println(str1);
				}
				ps.close();
				br1.close();
				br2.close();
				s.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
