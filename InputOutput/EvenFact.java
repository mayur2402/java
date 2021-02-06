import java.lang.*;
import java.util.*;

class Number
{
	public int Display(int iNo)
	{
		if(iNo <= 0)
		{
			return -1;
		}
		int iAns = 1;
		while(iNo != 0)
		{
			if(iNo % 2 == 0)
			{
				iAns = iAns*iNo;
			}
			iNo--;
		}
		return iAns;
	}

}

class EvenFact
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo = sc.nextInt();

		Number N = new Number();
		int iAns = N.Display(iNo);

		System.out.println(iAns);
	}

}