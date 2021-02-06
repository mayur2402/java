import java.lang.*;
import java.util.*;

class Addition
{
	public void Sum(int mat[][])
	{
		int arr[] = new int[mat.length];
		for(int i = 0;i < mat.length;i++)
		{
			for(int j = 0;j < mat[i].length;j++)
			{
				arr[i] = arr[i] + mat[i][j];
			}
		}

		for(int i = 0;i < mat.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

class MatrixAdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("How many rows");
			int row = sc.nextInt();

			System.out.println("How many column");
			int col = sc.nextInt();

			int mat[][] = new int[row][col];

			for(int i = 0;i < mat.length;i++)
			{
				for(int j = 0;j < mat[i].length;j++)
				{
					System.out.println("Enter Element");
					mat[i][j] = sc.nextInt();
				}
			}

			for(int i = 0;i < mat.length;i++)
			{
				for(int j = 0;j < mat[i].length;j++)
				{
					System.out.print(mat[i][j]+"\t");
				}
				System.out.println();
			}


			Addition A = new Addition();

			A.Sum(mat);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}