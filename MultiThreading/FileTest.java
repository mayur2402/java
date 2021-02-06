/*
	Program to accept filename from user and start thread for each file which will periodically check for the 		existance of the file.If file exist then display message
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class FileThread implements Runnable
{
	String Name = null;
	public FileThread(String Name)
	{
		this.Name = Name;
	}
	public void run() 
	{
		File F = new File(this.Name);
		try
		{
			if(F.exists())
			{
				System.out.println("File "+this.Name+" Exists");
			}
			else
			{
				System.out.println("File "+this.Name+" not Exists");
			}
		}
		catch(Exception IE)
		{
			System.out.println(IE);
		}	
	}
}
class FileTest
{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	{
		FileThread f[] = new FileThread[args.length];
		Thread[] T = new Thread[args.length];
		for(int i = 0;i < args.length;i++)
		{
			f[i] = new FileThread(args[i]);
			T[i] = new Thread(f[i]);
		//	System.out.println(T[i]);
			T[i].start();
		}
	}
}


