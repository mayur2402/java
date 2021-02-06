import java.lang.*;
import java.util.*;
class Policy
{
	public static void main(String args[]) throws Exception
	{
		int iNo = 0;
		Integer Pid = 0;
		String Pname = null;
		TreeMap<Integer,String> tm = new TreeMap<Integer,String> (); 
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Policies\t:");
		try
		{
			iNo = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error : Invalid number of policies");
		}
		for(int iCnt = 0;iCnt < iNo;iCnt++)
		{
			try
			{
				System.out.println("Enter policy id\t:");
				Pid = sc.nextInt();
				System.out.println("Enter policy name\t:");
				Pname = sc.next();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Error : Invalid Id ");
			}
			tm.put(Pid,Pname);
		}
		for(Integer key : tm.keySet())
		{
			String value = tm.get(key);
			System.out.println(key+"\t"+value);		
		}
	}
}

