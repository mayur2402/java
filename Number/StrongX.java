import java.util.*;
import java.lang.*;

class Digits
{
	public void checkStrong(int iS,int iE)
	{
		int iAns = 0,iFact = 1,iNo ;
		int fact[] = {1,1,2,6,24,120,120,5040,40320,362880};


		if(iS > iE)
		{
			return ;
		}

		while(iS != iE)
		{
			iNo = iS;
			iAns = 0;
			while(iNo != 0)
			{
				iFact = 1;
				int iDigit = iNo % 10;

				iAns = iAns + fact[iDigit];

	/*			while(iDigit != 0)
				{
					iFact = iFact * iDigit;
					iDigit--;
				}
				iAns = iAns + iFact;*/
				iNo = iNo / 10;
			}
			if(iAns == iS)
			{
				System.out.println(iAns);
			}
			iS++;
		}
	}
}

class StrongX
{
	public static void main(String[] args) {
		boolean bret = false;
		Digits D = new Digits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start of range");
		int iStart = sc.nextInt();

		System.out.println("Enter end of range");
		int iEnd = sc.nextInt();

		D.checkStrong(iStart,iEnd);

	}
}