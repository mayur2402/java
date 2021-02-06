import java.lang.*;

class Predict extends Thread
{
	public void run()
	{
		try
		{
			Thread T = Thread.currentThread();
			System.out.println("Name = "+T.getName());
			for(int iCnt = 1;iCnt <= 10;iCnt++)
			{
				System.out.println(T.getName()+"\t"+iCnt);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Thread_class
{
	public static void main(String args[])
	{
		Thread T = Thread.currentThread();

		System.out.println("Name = "+T.getName());
		
		Predict  pobj1 = new Predict();

		Thread T1 = new Thread(pobj1);	
		Thread T2 = new Thread(pobj1);

		T1.start();
		T2.start();
	}
}
