import java.lang.*;
import java.util.*;

class Bubble
{
	public void sort(int arr[])
	{
		int temp = 0;
		for(int i = 0;i < (arr.length);i++)
		{
			for(int j = 0;j < (arr.length-1-i);j++)
			{
				if(arr[j] > arr[i])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}	
	}
}
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers");
		int no = sc.nextInt();

		int[] arr = new int[no];

		System.out.println("Enter Elements");
		for(int i = 0;i < no;i++)
		{
			arr[i] = sc.nextInt();
		}
		Bubble B = new Bubble();
		B.sort(arr);

		System.out.println("Array after sorting");
		for(int i = 0;i < no;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
