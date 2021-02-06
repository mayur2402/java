import java.util.*;
class ord
{
	int id;	
	String desp;
	public ord()
	{
		id=0;	
		desp=null;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Id\t:");
		id=sc.nextInt();	
		System.out.println("\nEnter Description\t:");
		desp=sc.next();
	}
	public void display()	
	{
		System.out.println("\nID=\t:"+id+"\nDescription\t;"+desp);
	}
}
class po extends ord
{
	String c_name,v_name;
	public po()
	{
		super();
		c_name=null;
		v_name=null;
	}
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Customer Name\t:");
		c_name=sc.next();	
		System.out.println("\nEnter vendor name\t:");
		v_name=sc.next();
	}
	public void display()
	{
		super.display();
		System.out.println("\nCustomer Name=\t:"+c_name+"\nVendor name\t;"+v_name);
	}
}
class so extends ord
{
	String c_name,v_name;
	public so()
	{
		super();
		c_name=null;
		v_name=null;
	}
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Customer Name\t:");
		c_name=sc.next();	
		System.out.println("\nEnter vendor name\t:");
		v_name=sc.next();
	}
	public void display()
	{
		super.display();
		System.out.println("\nCustomer Name=\t:"+c_name+"\nVendor name\t;"+v_name);
	}
}
class order
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		ord o[]=new ord[5];
		for(i=0;i<5;i++)
		{
			System.out.println("\n1.purchase order\n2.sales order");
			int ch=sc.nextInt();
			if(ch==1)
			{
				o[i]=new po();
				o[i].accept();
			}
			else if(ch==2)
			{
				o[i]=new so();
				o[i].accept();
			}
		}
		for(i=0;i<5;i++)
		{
			o[i].display();
		}
	}
}

