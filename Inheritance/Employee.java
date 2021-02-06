package Emp;
import java.util.*;

public class Employee
{
	private int id;
	private String name,dept;
	private float sal;
	public Employee()
	{
		id = 0;
		name = " ";
		dept = " ";
		sal = 0.0f;
	}
	public Employee(int i,String n,String d,float s)
	{
		id = i;
		name = n;
		dept = d;
		sal =s;
	}
	public void accept()
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter id:");
		id=br.nextInt();
		System.out.println("Enter name:");
		name=br.next();
		System.out.println("Enter dept:");
		dept=br.next();
		System.out.println("Enter sal:");
		sal=br.nextFloat();
	}
	public void display()
	{
		System.out.println("id = "+id+"\nname = "+name+"\ndept = "+dept+"\nsal = "+sal);
	}
	public float getsal()
	{
		return sal;
	}
}
