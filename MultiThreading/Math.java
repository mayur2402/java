import java.util.*;

class Operation extends Thread
{
	int iNo1 ,iNo2;
	public Operation(int iNo1,int iNo2)
	{
		this.iNo1 = iNo1;
		this.iNo2 = iNo2;
	}
	public void Add()
	{
		System.out.println(this.iNo1 + this.iNo2);
	}
	public void Sub()
	{
		System.out.println(this.iNo1 - this.iNo2);
	}
	public void Multi()
	{
		System.out.println(this.iNo1 * this.iNo2);
	}
	public void Div()
	{
		System.out.println(this.iNo1 / this.iNo2);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		Add();
		Sub();
		Multi();
		Div();
	}

}
class Math
{
	public static void main(String args[])
	{
		int iNo1 = Integer.parseInt(args[0]);
		int iNo2 = Integer.parseInt(args[1]);

		Operation obj = new Operation(iNo1,iNo2);
		Thread T1 = new Thread(obj);
		Thread T2 = new Thread(obj);
		Thread T3 = new Thread(obj);
		Thread T4 = new Thread(obj);

		T1.start();
		T2.start();
		T3.start();
		T4.start();
	}
}
