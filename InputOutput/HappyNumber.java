/*
	Write a Java program to find and print the first 10 happy numbers.
	Happy number: Starting with any positive integer, replace the number by the sum of the squares of its 		digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not 		include 1.
	Example: 19 is a happy number
	12 + 92=82
	82 + 22=68
	62 + 82=100
	12 + 02 + 02=1
*/

import java.lang.*;
import java.util.*;

class HappyNumber
{
	public static void main(String rags[])
	{
		int iCnt = 1,iNum = 1,iSum = 0,iDigit = 0, i = 0,iSquare = 0,count = 0;
		while(iCnt != 10)
		{
			i = iNum;
			while(true)
			{
				iSum = 0;
				while(i != 0)
				{
					iDigit = i % 10;
					iSquare = iDigit * iDigit;
					iSum = iSum + iSquare;
					i = i / 10;
				}
				if(iSum == 1)
				{
					System.out.println(iNum);
					iNum++;
					iCnt++;
					break;
				}
				if(iSum == 4)
				{
					iSum = 0;
					i = iNum++;
					break;
				}
				i = iSum;
			}
		}
	}
}
