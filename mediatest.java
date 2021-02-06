import java.util.*;
abstract class media
{
	 int id;
	 String title;
	 int price;
	public media(int id,String title,int price)
	{
		this.id=id;
		this.title=title;
		this.price=price;
	}
	public abstract void accept();
}
class book extends media
{
	int nob;
	 book(int nob)
	{
		super(id,title,price);
		this.nob=nob;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter number of books\t:");	
		nob=sc.nextInt();
	}
	public void display()
	{
		System.out.println("\nNumber of books are\t:"+this.nob);
	}
}
class tape extends media
{
	int t;
	public tape(int t)
	{
		super(id,title,price);
		this.t=t;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter capacity of tape\t:");	
		t=sc.nextInt();
	}
	public void display()
	{
		System.out.println("\ncapacity of tape are\t:"+this.t);
	}
}
class mediatest
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,ch;
		System.out.println("\nHow many media's\t:");
		n=sc.nextInt();
		System.out.println("\n1.book\n2.tape\n");
		System.out.println("Enter your choice\t:");	
		ch=sc.nextInt();		
		if(ch==1)	
		{		
			for(i=0;i<n;i++)	
			{	
				System.out.println("\nEnter id\t:");
				id=sc.nextInt();
				System.out.println("\nEnter title\t:");
				title=sc.next();
				System.out.println("\nEnter price\t:");
				price=sc.nextInt();
				book b=new book();
				b.accept();
				b.display();
			}
		}
		else if(ch==2)	
		{		
			for(i=0;i<n;i++)	
			{	
				System.out.println("\nEnter id\t:");
				id=sc.nextInt();
				System.out.println("\nEnter title\t:");
				title=sc.next();
				System.out.println("\nEnter price\t:");
				price=sc.nextInt();
				tape t=new tape();
				t.accept();
				t.display();	
			}
		}
	}
}
