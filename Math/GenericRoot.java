import java.util.*;
import java.lang.*;

class Root
{
	public int checkRoot(int iNo)
	{
		int iAns = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		while(true)
		{
			iAns = 0;
			while(iNo != 0)
			{
				int iDigit = iNo % 10;

				iAns = iAns + iDigit;

				iNo = iNo / 10;
			}
			System.out.println(iAns);
			if(iAns < 10)
			{
				break;
			}
			iNo = iAns;
		}
		return iAns;
	}

}


class GenericRoot
{
	public static void main(String[] args) {
		int iAns;
		Root D = new Root();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter start of range");
		int iNo = sc.nextInt();

		iAns = D.checkRoot(iNo);

		System.out.println(iAns);
	}
}