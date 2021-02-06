/*
A survey of the computer market shows that personal computers are sold at varying
costs by the vendors.
Determine the average cost and the range of Amounts.
*/
import java.io.*;
import java.lang.*;

class Personal
{
	float Amount[];
	public Personal(float Amount[])
	{
		this.Amount = Amount;
	}

	public float average()
	{
		float total = 0.0f;
		for(int i = 0;i < this.Amount.length;i++)
		{
			total += this.Amount[i];
		}
		return (total/this.Amount.length);
	}
	public float Range()
	{
		float max = 0.0f,min = 0.0f;
		max = min = this.Amount[0];

		for(int i = 0;i < this.Amount.length;i++)
		{
			if(max < this.Amount[i])
			{
				max = this.Amount[i];
			}
			if(min > this.Amount[i])
			{
				min = this.Amount[i];
			}
		}
		return (max - min);
	}
}

class Computer
{
	public static void main(String[] args) 
	{
		int no = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{

			System.out.println("How many personal computers in month");
			no = Integer.parseInt(br.readLine());
			float Amount[] = new float[no];
			for(int i = 0;i < no;i++)
			{
				System.out.println("Enter Amount of "+(i+1)+" computer");
				Amount[i] = Float.parseFloat(br.readLine());
			}
			Personal p = new Personal(Amount);

			System.out.println("Average cost of computers are "+p.average());

			System.out.println("Range of computer is "+p.Range());

		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
}