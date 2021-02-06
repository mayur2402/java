import java.net.*;

class InetAddressDemo
{
	public static void main(String args[])
	{
		try
		{
			InetAddress Address = InetAddress.getLocalHost();
			System.out.println(Address);
			Address = InetAddress.getByName("www.google.com");
			System.out.println(Address);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
}
