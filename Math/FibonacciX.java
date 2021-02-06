import java.lang.*;
import java.util.*;

class Number
{
	public void fibSeries(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int first = 0,second = 1,third,iCnt = 0;

		while(first < iNo)
		{
			System.out.println(first);
			third = first + second;
			first = second;
			second = third;
		}
	}
}

class FibonacciX
{
	public static void main(String[] args) 
	{
		int iNo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to check armstrong");
		try{
			iNo = sc.nextInt();

			Number N = new Number();

			N.fibSeries(iNo);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}