import java.lang.*;
import java.util.*;

class Add
{
	int iNo1,iNo2;
	public Add(int iNo1,int iNo2)
	{
		this.iNo1 = iNo1;
		this.iNo2 = iNo2;
	}
	public int Display()
	{
		return this.iNo1+this.iNo2;
	}
}

class Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int iNo1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int iNo2 = sc.nextInt();

		Add A = new Add(iNo1,iNo2);

		int iAns = A.Display();

		System.out.println(iAns);
	}

}