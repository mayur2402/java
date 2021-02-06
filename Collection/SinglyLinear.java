package MyCollection;
import java.lang.*;
import java.util.*;

public class SinglyLinear
{
	public int Data;
	SinglyLinear Next;
	SinglyLinear Head = null;

	public SinglyLinear(int Data)
	{
		this.Data = Data;
		Next = null;
	}

	public void Create(int iValue)
	{
		if(Head == null)
		{
			Head = new SinglyLinear(iValue);
		}
		else
		{
			SinglyLinear temp = Head;
			while(temp.Next != null)
			{
				temp = temp.Next;
			}
			temp.Next = new SinglyLinear(iValue);
		}
	}
	public int Count()
	{
		int count = 0;
		SinglyLinear temp = Head;

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
			Head = new SinglyLinear(iValue);
		}
		else
		{
			SinglyLinear temp = Head;
			Head = new SinglyLinear(iValue);
			Head.Next = temp;
		}
	}
	public void InsertLast(int iValue)
	{
		if(Head == null)
		{
			Head = new SinglyLinear(iValue);
		}
		else
		{
			SinglyLinear temp = Head;
			while(temp.Next != null)
			{
				temp = temp.Next;
			}
			temp.Next = new SinglyLinear(iValue);
		}
	}
	public void InsertAtPos(int iValue,int iPos)
	{
		int size = 0;
		size = Count();
		if(iPos == 1)
		{
			Head = new SinglyLinear(iValue);
		}
		else if (iPos == (size+1))
		{
			InsertLast(iValue);
		}
		else
		{
			SinglyLinear temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			SinglyLinear temp1 = temp.Next;
			temp.Next = new SinglyLinear(iValue);
			temp.Next.Next = temp1;
		}
	}

	public void DeleteHead()
	{
		if(Head.Next == null)
		{
			Head = null;
		}
		else
		{
			SinglyLinear temp = Head.Next;
			Head = temp;
		}
	}

	public void DeleteLast()
	{
		if(Head == null)
		{
			return ;
		}
		if(Head.Next == null)
		{
			Head = null;
		}
		else
		{
			SinglyLinear temp = Head;
			while(temp.Next.Next != null)
			{
				temp = temp.Next;
			}
			temp.Next = null;
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
			SinglyLinear temp = Head;
			for(int i = 0;i < (iPos-2);i++)
			{
				temp = temp.Next;
			}
			temp.Next = temp.Next.Next;
		}
	}

	public boolean Search(int iValue)
	{
		SinglyLinear temp = Head;
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
		SinglyLinear temp = Head;
		System.out.print("Data in the SinglyLinear is\t");
		while(temp != null)
		{
			System.out.print(temp.Data+"\t");
			temp = temp.Next;
		}
		System.out.println();
	}		
}
