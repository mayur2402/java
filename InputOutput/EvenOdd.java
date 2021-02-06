import java.util.*;
class Difference
{
	public int No,Arr[];
	public Difference(int iArr[],int iNo)
	{
		this.Arr = iArr;
		this.No = iNo;
	}
	public int Display()
	{
		int iAns = 0;
		for(int iCnt = 0;iCnt < this.No;iCnt++)
		{
			if(this.Arr[iCnt] % 2 == 0)
			{
				iAns = iAns + this.Arr[iCnt];
			}
			else
			{
				iAns = iAns - this.Arr[iCnt];
			}
		}
		return iAns;
	}
}
class EvenOdd
{
	public static void main(String arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHow many elements\t:");
		int iNo = sc.nextInt();
		int[] iArr = new int[iNo];
		System.out.println("\nEnter "+iNo+" Elements");
		for(int iCnt = 0;iCnt < iNo;iCnt++)
		{
			iArr[iCnt] = sc.nextInt();
		}
		Difference dObj = new Difference(iArr,iNo);
		int iDiff = dObj.Display();
		System.out.println("\nDifference between even elements and odd elements are\t"+iDiff);
	}
}
