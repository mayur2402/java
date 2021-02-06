/*
	algorithm gcd(num1,num2)
	begin
		if (num1 = num2) then
		return num1
		if (num1 < num2) then
		n = num1
		else
		n = num2
		i =1;
		ans = 0;
		for i to n/2
		if (num1 % i = 0 and num2 % i = 0) then 
		ans = i
				
		return ans
	end
	
	begin
		if (num1 = num2) then
		return num1
		if(num1 < num2) then
		return gcd(num1,(num2-num1))
		if(num1 > num2) then
		return gcd((num1-num2),num2)
	end

*/
import java.lang.*;
import java.util.*;
class CheckGCD
{
	public int iNo1 = 0,iNo2 = 0;
	public CheckGCD(int i,int j)
	{
		this.iNo1 = i;
		this.iNo2 = j;
	}
	public int ChkGCD()
	{
		if(this.iNo1 < 0)
		{
			this.iNo1 = -this.iNo1;
		}
		if(this.iNo2 < 0)
		{
			this.iNo2 = -this.iNo2;
		}
		int N = 0,i = 0,Ans = 0;
		if(this.iNo1 < this.iNo2)
		{
			N = this.iNo1;
		}
		else
		{
			N = this.iNo2;
		}
		for(i = 1;i <= (N/2);i++)
		{
			if((this.iNo1 % i == 0) && (this.iNo2 % i ==0))
			{
				Ans = i;
			}
		}
		return Ans;
	}
}
class GCD
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int iNo1 = 0,iNo2 = 0;
		try
		{
			System.out.println("Enter First Number");
			iNo1 = sc.nextInt();
			System.out.println("Enter Second Number");
			iNo2 = sc.nextInt();
		}
		catch(InputMismatchException IME)
		{
			System.out.println(IME);
		}

		CheckGCD cobj1 = new CheckGCD(iNo1,iNo2);
		int iAns = cobj1.ChkGCD();

		System.out.println("GCD of Number is "+iAns);
	}
}
