package MyCollection;
import java.lang.*;
import java.util.*;

public class DoublyLinear
{
	public int Data;
	DoublyLinear Next;
	DoublyLinear Prev;
	DoublyLinear Head = null;
	DoublyLinear Tail = null;
	public DoublyLinear(int Data)
	{
		this.Data = Data;
		Next = null;
		Prev = null;
	}

	public void Create(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyLinear(iValue);
			Tail = Head;
		}
		else
		{
			DoublyLinear temp = Head;
			while(temp.Next != null)
			{
				temp = temp.Next;
			}
			Tail.Next = new DoublyLinear(iValue);
			Tail.Next.Prev = Tail;
			Tail = Tail.Next;
		}
	}
	public int Count()
	{
		int count = 0;
		DoublyLinear temp = Head;
		while(temp != null)
		{
			count++;
			temp = temp.Next;
		}
		return count;
	}
	public void InsertFirst(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyLinear(iValue);
			Tail = Head;
		}
		else
		{
			DoublyLinear temp = Head;
			Head = new DoublyLinear(iValue);
			Head.Next = temp;
			temp.Prev = Head;
		}
	}
	public void InsertLast(int iValue)
	{
		if(Head == null)
		{
			Head = new DoublyLinear(iValue);
			Tail = Head;
		}
		else
		{
			Tail.Next = new DoublyLinear(iValue);
			Tail.Next.Prev = Tail;
			Tail = Tail.Next;
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
			DoublyLinear temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			temp.Next.Prev = new DoublyLinear(iValue);
			temp.Next.Prev.Next = temp.Next;
			temp.Next = temp.Next.Prev;
			temp.Next.Prev = temp;
		}
	}

	public void DeleteHead()
	{
		if(Head == Tail)
		{
			Head = null;
			Tail = null;
		}
		else
		{
			DoublyLinear temp = Head.Next;
			Head = temp;
			Head.Prev = null;
		}
	}

	public void DeleteLast()
	{
		if(Head == Tail)
		{
			Head = null;
			Tail = null;
		}
		else
		{
			Tail = Tail.Prev;
			Tail.Next = null;			
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
			DoublyLinear temp = Head;
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
		DoublyLinear temp = Head;
		boolean find = false;
		while(temp != null)
		{
			if(temp.Data == iValue)
			{
				find = true;
			}
			temp = temp.Next;
		}
		return find;
	}

	public void Display()
	{
		DoublyLinear temp = Head;
		System.out.print("Data in the DoublyLinear is\t");
		while(temp != null)
		{
			System.out.print(temp.Data+"\t");
			temp = temp.Next;
		}
		System.out.println();
	}
}

