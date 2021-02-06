package MyCollection;
import java.lang.*;
import java.util.*;

public class SinglyCircular
{
	public int Data;
	SinglyCircular Next;
	SinglyCircular Head = null;
	SinglyCircular Tail = null;
	public SinglyCircular(int Data)
	{
		this.Data = Data;
		Next = null;
	}

	public void Create(int iValue)
	{
		if(Head == null)
		{
			Head = new SinglyCircular(iValue);
			Tail = Head;
		}
		else
		{
			Tail.Next = new SinglyCircular(iValue);
			Tail = Tail.Next;
			Tail.Next = Head;
		}
	}
	public int Count()
	{
		int count = 0;
		SinglyCircular temp = Head;
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
			Head = new SinglyCircular(iValue);
			Tail = Head;
		}
		else
		{
			SinglyCircular temp = Head;
			Head = new SinglyCircular(iValue);
			Head.Next = temp;
			Tail.Next = Head;
		}
	}
	public void InsertLast(int iValue)
	{
		if(Head == null)
		{
			Head = new SinglyCircular(iValue);
			Tail = Head;
		}
		else
		{
			Tail.Next = new SinglyCircular(iValue);
			Tail = Tail.Next;
			Tail.Next = Head;
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
			SinglyCircular temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			SinglyCircular temp1 = temp.Next;
			temp.Next = new SinglyCircular(iValue);
			temp.Next.Next = temp1;
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
			SinglyCircular temp = Head.Next;
			Head = temp;
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
			SinglyCircular temp = Head;
			while(temp.Next.Next != Tail.Next)
			{
				temp = temp.Next;
			}
			Tail = temp;
			Tail.Next = Head;
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
			SinglyCircular temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			temp.Next = temp.Next.Next;
		}
	}

	public boolean Search(int iValue)
	{
		SinglyCircular temp = Head;
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
		SinglyCircular temp = Head;
		System.out.print("Data in the SinglyCircular is\t");
		do
		{
			System.out.print(temp.Data+"\t");
			temp = temp.Next;
		}while(temp != Tail.Next);
		System.out.println();
	}
}
