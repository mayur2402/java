import java.util.*;
class Greater
{
	public static void main(String args[])
	{
		int n1=0,n2=0,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter two number\t:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		ans=((n1+n2)+(Math.abs(n1-n2)))/2;
		System.out.println(ans);
	}
}
