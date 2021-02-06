import java.util.*;
public class student
{
	int rollno;
	String name;
	float per;
	static int cnt;
	//Scanner sc=new Scanner(System.in);
	public student()
	{
		rollno=0;
		name=null;
		per=0;
	}
	public student(int rn,String nm,float p)
	{
		rollno=rn;
		name=nm;
		per=p;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the roll no\t:");
		rollno=sc.nextInt();
		System.out.println("\nEnter the name\t:");
		name=sc.next();
		System.out.println("\nEnter the percentage\t:");
		per=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("\nRoll No   \t:"+rollno);
		System.out.println("\nname      \t:"+name);
		System.out.println("\npercentage\t:"+per);
		cnt++;
		System.out.println("\nNo of object\t:"+cnt);
	}
	static void sortstudent(student stuarr[],int n)
	{
		student temp;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(stuarr[i].per>stuarr[j].per)
				{
					temp=stuarr[i];
					stuarr[i]=stuarr[j];
					stuarr[j]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		student s1=new student(1,"Aniket",90);
		s1.display();
		student s2=new student(2,"mayur",89);
		s2.display();
		student s3=new student(3,"devarshi",89);
		s3.display();
		
		student[] stuarray=new student[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the no of student\t:");
		int In=sc.nextInt();
		for(i=0;i<In;i++)
		{
			stuarray[i]=new student();
			stuarray[i].accept();
		}
		for(i=0;i<In;i++)
		{
			stuarray[i].display();
		}
		sortstudent(stuarray,In);
		System.out.println("\nSorted array list\n");
		for(i=0;i<In;i++)
		{
			stuarray[i].display();
		}
	}
}
