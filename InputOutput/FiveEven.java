/*
	Accept N numbers from user and display all such elements which are even and divisible by 5.
	Input: N :	6
	Elements :	85 66 3 80 93 88
	Output	 :	80
*/

import java.util.*;
import java.io.*;
class Calculate
{
	int iArr[],iLength;
	public Calculate(int iArr[],int iLength)
	{
		this.iArr = iArr;
		this.iLength = iLength;
	}
	public void Display()
	{
		System.out.println();
		for(int iCnt = 0;iCnt < this.iLength;iCnt++)
		{
			if((this.iArr[iCnt] % 5 == 0) && (this.iArr[iCnt] % 2 == 0))
			{
				System.out.print(this.iArr[iCnt]+"\t");
			}
		}
	}
}

class FiveEven
{
	public static void main(String arr[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nHow many numbers\t:");
		int iNo = Integer.parseInt(br.readLine());

		if(iNo <= 0)
		{
			System.out.println("Error : InValid number");
			System.exit(0);
		}

		int iArr[] = new int[iNo];

		System.out.println("Enter Numbers");
		for(int iCnt = 0;iCnt < iNo;iCnt++)
		{
			iArr[iCnt] = Integer.parseInt(br.readLine());
		}

		Calculate cObj = new Calculate(iArr,iNo);
		cObj.Display();
	}
}
