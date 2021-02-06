import Emp.Employee;
import java.io.*;
import java.util.*;

class Manager extends Employee
{
	private float bonus;
	public Manager()
	{
		super();
		bonus = 0.0f;
	}
	public Manager(int i,String n,String d,float s,float b)
	{
		super(i,n,d,s);
		bonus = b;
	}
	public void accept()
	{
		super.accept();
		Scanner br=new Scanner(System.in);
		System.out.println("enter bonus=");
		bonus=br.nextFloat();
	}
	public void display()
	{
		super.display();
		System.out.println("bonus "+bonus);
	}
	public float getBonus()
	{
		return bonus;
	}
}
class ManagerTest
{
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter no of manager");
		int n=br.nextInt();
		Manager m[]=new Manager[n];
		for(int i=0;i<n;i++)
		{
			m[i]=new Manager();
			m[i].accept();
		}
		float max=0.0f;
		int max_pos=-1;
		for(int i=0;i<n;i++)
		{
			float tot=m[i].getsal()+m[i].getBonus();
			if(tot>max)
			{
				max=tot;
				max_pos=i;
			}
		}
		System.out.println("Manager with max salary");
		m[max_pos].display();
	}
}
