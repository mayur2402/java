import java.lang.*;
import java.util.*;

class Number
{
	public boolean isArmstrong(int iNo)
	{

		boolean isarmstrong = false;
		int temp = iNo,iN = 0;

		while(iNo != 0)
		{
			int iDigit = iNo % 10;
			iN = iN + iDigit*iDigit*iDigit;
			iNo = iNo / 10;
		}
		if(iN == temp)
		{
			isarmstrong = true;
		}
		return isarmstrong;
	}
}

class Armstrong
{
	public static void main(String[] args) 
	{
		int iNo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to check armstrong");
		try{
			iNo = sc.nextInt();

			Number N = new Number();

			boolean isarmstrong = N.isArmstrong(iNo);

			if(isarmstrong)
			{
				System.out.println("Number is armstrong");
			}
			else
			{
				System.out.println("Number is not armstrong");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}