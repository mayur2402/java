import java.lang.*;
import java.net.*;
class Url
{
	public static void main(String args[]) throws Exception
	{
		URL myurl = new URL("http://www.google.com/myexe");
		System.out.println("Protocol " + myurl.getProtocol());
		System.out.println("Port " + myurl.getPort());
		System.out.println("Host " + myurl.getHost());
		System.out.println("File " + myurl.getFile());
		URLConnection uc = myurl.openConnection();
		System.out.println(uc); 
	}
}
