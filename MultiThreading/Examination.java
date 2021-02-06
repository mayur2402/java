import java.util.*;
class Exam extends Thread
{
	public void run()
	{
		for(int i = 0;i < 50;i++)
		{
			System.out.println("Examination");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException E)
			{
				System.out.println(E);
			}
		}
	}
}
class Examination
{

	public static void main(String args[]) throws Exception
	{
		Exam E = new Exam();
		Thread T = new Thread(E);
		T.start();
	}
}
