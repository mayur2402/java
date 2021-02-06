import java.lang.*;
import java.util.*;

class Number
{
	public void Display(int arr[])
	{
		int size = arr.length;

		for(int i = 1;i < (size-1);i++)
		{
			if((arr[i-1]+arr[i+1]) == arr[i])
			{
				System.out.println(arr[i]);
			}
		}
	}
}

class Lucky
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int iNo = 0;
		try
		{
			System.out.println("How many numbers in array");
			iNo = sc.nextInt();

			int[] arr = new int[iNo];
			for(int i = 0;i < iNo;i++)
			{
				System.out.println("Enter Element");
				arr[i] = sc.nextInt();
			}

			Number N = new Number();

			System.out.println("Lucky numbers are");
			N.Display(arr);
		}
		catch(Exception e)
		{

		}		
	}

}