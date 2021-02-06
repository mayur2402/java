import java.util.*;
import java.lang.*;

class Digits
{
	public boolean checkStrong(int iNo)
	{
		int iAns = 0,iFact = 1,temp = iNo;
		boolean strong = false;
		while(iNo != 0 && iAns >= temp)
		{
			iFact = 1;
			int iDigit = iNo % 10;
			while(iDigit != 0)
			{
				iFact = iFact * iDigit;
				iDigit--;
			}
			System.out.println(iAns);
			iAns = iAns + iFact;
			iNo = iNo / 10;
		}
		if(iAns == temp)
		{
			strong = true;
		}
		else
		{
			strong = false;
		}
		return strong;
	}
}

class Strong
{
	public static void main(String[] args) {
		boolean bret = false;
		Digits D = new Digits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo = sc.nextInt();

		bret = D.checkStrong(iNo);

		if(bret == true)
		{
			System.out.println("Number is strong");
		}
		else
		{
			System.out.println("Number is not Strong");
		}
	}
}