import java.io.*;
import java.util.*;
class mynumber
{
		private int num;
		mynumber()
		{
			num=0;
		}
		mynumber(int num)
		{
			this.num=num;
		}
		public void isnegative()
		{
			if(num<0)
			{
				System.out.println(num+" is negative");
			}
		}
		public void ispositive()
		{
			if(num>0)
			{
				System.out.println(num+" is positive");
			}
		}
		public void iszero()
		{
			if(num==0)
			{
				System.out.println(num+" is zero");
			}
		}
		public void isodd()
		{
			if(num%2!=0)
			{
				System.out.println(num+" is odd");
			}
		}
		public void iseven()
		{
			if(num%2==0)
			{
				System.out.println(num+" is even");
			}
		}
}
class Mynumber
{
	public static void main(String args[])
	{
		String a=args[0];
		int aa=Integer.parseInt(a);
		mynumber n1=new mynumber(aa);
		n1.isnegative();
		n1.ispositive();
		n1.iszero();
		n1.isodd();
		n1.iseven();
	}
}
