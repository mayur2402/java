import java.lang.*;
import java.util.*;

class Count
{
	public int Word(String str)
	{
		int count = 0,i = 0;
		char[] strarr = str.toCharArray();
		while(i < str.length())
		{
			if(strarr[i] == ' ')
			{
				while(i < str.length() && strarr[i] == ' ')
				{
					i++;
				}
			}
			else if(strarr[i] != ' ')
			{
				count++;
				while(i < str.length() && strarr[i] != ' ')
				{
					i++;
				}
			}
		}
		return count;
	}	
}

class CountWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter String");
			String str = sc.nextLine();

			Count C = new Count();

			int wCount = C.Word(str);

			System.out.println(wCount);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
}