import java.io.*;
import java.util.*;
class threed
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,d,s,ss,k,tot=0;
		System.out.println("How many department");
		d=sc.nextInt();
		System.out.println("How many students");
		s=sc.nextInt();
		System.out.println("How many subject");
		ss=sc.nextInt();
		
		int [][][] arr =new int[d][s][ss];
		System.out.println("Enter details");
		for(i=0;i<d;i++)
		{
			System.out.println("Details of department"+(i+1));
			for(j=0;j<s;j++)
			{
				System.out.println("Details of students"+(j+1));
				for(k=0;k<ss;k++)
				{
					System.out.println("Enter marks of subject"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(i=0;i<d;i++)
		{
			System.out.print("department"+(i+1)+"\n");
			for(j=0;j<s;j++)
			{		
				System.out.println("student"+(j+1)+"\t");
				for(k=0;k<ss;k++)
				{
					System.out.println("marks of subject"+(k+1)+"\t");
					System.out.println(arr[i][j][k]);
					tot=tot+arr[i][j][k];
					System.out.println("Total="+tot);
				}
				tot=0;
			}
		}	
	}
}

