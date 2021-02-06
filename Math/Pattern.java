/*
input : 6 6 

output

	&	*	*	*	*	*

	*	&	1	2	3	*

	*	A	&	4	5	*

	*	B	c 	&	6	*

	*	D  	E 	F	&	*

	*	*	*	*	* 	&

*/

import java.util.*;
class Number
{
	public void Display(int iRow,int iCol)
	{
		int i = 1,j = 1;
		char ch = 'A';
		int iNo = 1;
		if(iRow != iCol)
		{
			return ;
		}

		for(i = 1;i <= iRow;i++)
		{
			for(j = 1;j <= iCol;j++)
			{
				if(i == j)
				{
					System.out.print("&\t");
				}
				else if(i == 1 || j == 1 || i == iRow || j == iCol)
				{
					System.out.print("*\t");
				}
				else if(i > j)
				{
					System.out.print(ch+"\t");
					ch++;
				}
				else
				{
					System.out.print(iNo+"\t");
					iNo++;
				}
			}
			System.out.println(i);
		}
	}
}

class Pattern
{
	public static void main(String[] args) 
	{
		int iNo1 = 0,iNo2 = 0;

		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Enter Number ");
			iNo1 = sc.nextInt();

			System.out.println("Enter Number ");
			iNo2 = sc.nextInt();

			Number N = new Number();

			N.Display(iNo1,iNo2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}