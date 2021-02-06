/*
A book shop uses a personal computer to maintain the inventory of books that are being sold at
the shop. The list includes details such as author, title, price, publisher, stock position, etc.
Whenever a customer wants a book, the shopkeeper inputs the title and author of the book and
the system replies whether it is in the list or not. If it is not, an appropriate message is displayed.
If book is in the list, then the system displays the book details and asks for number of copies. If
the requested copies are available, the total cost of the books is displayed; otherwise the
message "Required copies not in stock" is displayed.
*/

import java.lang.*;
import java.util.*;
import java.io.*;


class BookInfo
{
	static BookInfo head = null;
	public String author;
	public String title;
	public String publisher;
	public double price;
	public int stock;
	BookInfo next = null;
	public BookInfo()
	{

	}
}

class BookClass
{
	public void node()
	{
		if(BookInfo.head == null)
		{
			BookInfo.head = new BookInfo();
			BookInfo.head.next = null;
			accept(BookInfo.head);
		}
		else
		{
			BookInfo temp = BookInfo.head;
			while(temp != null)
			{
				temp = temp.next;
			}
			temp = new BookInfo();
			temp.next = null;
			accept(temp);
		}
	}

	public void accept(BookInfo first)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			
			System.out.println("Enter author of book");
			first.author = sc.nextLine();
			System.out.println("Enter Title of book");
			first.title = sc.nextLine();
			System.out.println("Enter publisher of book");
			first.publisher = sc.nextLine();
			System.out.println("Enter Price of book");
			first.price = sc.nextDouble();
			System.out.println("Enter number of copies of book");
			first.stock = sc.nextInt();
			
		}
		catch (Exception e)
		{
			System.out.println(e);			
		}
	}
	public void display()
	{
		if(BookInfo.head == null)
		{
			System.out.println("There is no book available");
		}
		else
		{
			BookInfo first = BookInfo.head;
			while(first != null)
			{
				System.out.println("Book Author\t"+first.author);
				System.out.println("Book Title\t"+first.title);
				System.out.println("Book Publisher\t"+first.publisher);
				System.out.println("Book Price\t"+first.price);
				System.out.println("Book Copies\t"+first.stock);
				first = first.next;
			}
		}
	}
}
class Customer
{
	private String title;
	private String author;
	private int number_of_copies ;
	public Customer(String title,String author)
	{
		this.title = title;
		this.author = author;
	}

	public void check()
	{
		BookInfo first = BookInfo.head;
		Scanner sc = new Scanner(System.in);
		while(first != null)
		{
			if((this.title).equals(first.title) && (this.author).equals(first.author))
			{
				System.out.println("Book Author\t"+first.author);
				System.out.println("Book Title\t"+first.title);
				System.out.println("Book Publisher\t"+first.publisher);
				System.out.println("Book Price\t"+first.price);
				System.out.println("Book Copies\t"+first.stock);
				System.out.println("How many copies you want");
				number_of_copies = sc.nextInt();
				if (number_of_copies <= first.stock)
				{
					System.out.println("Total price of "+number_of_copies+" books are "+number_of_copies*first.price);
					break;
				}
				else
				{
					System.out.println("Number of copies are not available");
					break;				
				}
			}
			else
			{
				first = first.next;
			}
		}
		if(first == null)
		{
			System.out.println("Book is not available");
		}	
	}
}

class Book
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int choice = 0;
			while(choice != 3)
			{
				BookClass book = new BookClass();
				System.out.println("1.Book Employee\n2.Customer\n3.Exit");
				choice = Integer.parseInt(br.readLine());
				switch(choice)
				{
					case 1:
					book.node();
					book.display();
					break;
					case 2:
					System.out.println("Enter Title of book");
					String title = br.readLine();
					System.out.println("Enter author of book");
					String author = br.readLine();
					Customer cobj = new Customer(title,author);
					cobj.check();
					break;
					default :
					break;
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e);			
		}
	}
}