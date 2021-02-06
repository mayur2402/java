package MyCollection;
import java.lang.*;
import java.util.*;

public class DoublyCircular
{
	public int Data;
	DoublyCircular Next;
	DoublyCircular Prev;
	DoublyCircular Head = null;
	DoublyCircular Tail = null;
	public DoublyCircular(int Data)
	{
		this.Data = Data;
		Next = null;
		Prev = null;
	}

	public void Create(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyCircular(iValue);
			Tail = Head;
			Tail.Next = Head;
			Head.Prev = Tail;
		}
		else
		{
			Tail.Next = new DoublyCircular(iValue);
			Tail.Next.Prev = Tail;
			Tail = Tail.Next;
			Tail.Next = Head;
			Head.Prev = Tail;
		}
	}
	public int Count()
	{
		int count = 0;
		DoublyCircular temp = Head;
		do
		{
			count++;
			temp = temp.Next;
		}while(temp != Tail.Next);
		return count;
	}
	public void InsertFirst(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyCircular(iValue);
			Tail = Head;
			Tail.Next = Head;
			Head.Prev = Tail;
		}
		else
		{
			DoublyCircular temp = Head;
			Head = new DoublyCircular(iValue);
			temp.Prev = Head;
			Head.Next = temp;
			Head.Prev = Tail;
			Tail.Next = Head;
		}
	}
	public void InsertLast(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyCircular(iValue);
			Tail = Head;
			Tail.Next = Head;
			Head.Prev = Tail;
		}
		else
		{
			Tail.Next = new DoublyCircular(iValue);
			Tail.Next.Prev = Tail;
			Tail = Tail.Next;
			Head.Prev = Tail;
		}
	}
	public void InsertAtPos(int iValue,int iPos)
	{
		int size = 0;
		size = Count();
		if(iPos == 1)
		{
			InsertFirst(iValue);
		}
		else if (iPos == (size+1))
		{
			InsertLast(iValue);
		}
		else
		{
			DoublyCircular temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			temp.Next.Prev = new DoublyCircular(iValue);
			temp.Next.Prev.Next = temp.Next;
			temp.Next = temp.Next.Prev;
			temp.Next.Prev = temp;
		}
	}

	public void DeleteHead()
	{
		if(Head.Next == null)
		{
			Head = null;
			Tail = null;
		}
		else
		{
			Head = Head.Next;
			Head.Prev = Tail;
			Tail.Next = Head;
		}
	}

	public void DeleteLast()
	{
		if(Head.Next == null)
		{
			Head = null;
			Tail = null;
		}
		else
		{
			Tail.Prev.Next = Head;
			Tail = Tail.Prev;
			Head.Prev = Tail;
		}
	}

	public void DeleteAtPos(int iPos)
	{
		int size = Count();

		if(iPos == 1)
		{
			DeleteHead();
		}
		else if(iPos == size)
		{
			DeleteLast();
		}
		else
		{
			DoublyCircular temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			temp.Next.Next.Prev = temp;
			temp.Next = temp.Next.Next;
		}
	}

	public boolean Search(int iValue)
	{
		DoublyCircular temp = Head;
		boolean find = false;
		do
		{
			if(temp.Data == iValue)
			{
				find = true;
			}
			temp = temp.Next;
		}while(temp != Tail.Next);
		return find;
	}

	public void Display()
	{
		DoublyCircular temp = Head;
		System.out.print("Data in the DoublyCircular is\t");
		do
		{
			System.out.print(temp.Data+"\t");
			temp = temp.Next;
		}while(temp != Tail.Next);
		System.out.println();
	}
}	
