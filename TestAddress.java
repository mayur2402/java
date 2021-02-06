import java.lang.*;
import java.util.*;
class AddressBook
{
	private long phoneNumber;
	private String tempAddress;
	private String permAddress;

//Get And Set method is used to access non public Characteristics outside the class

	public long GetPhoneNumber()
	{
		return phoneNumber;
	}
	public void SetPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	Address obj = new Address();	//creating object of inner class
	public void SetTempAddress(String name,String street,String city,String state)
	{
		obj.SetName(name);
		obj.SetStreet(street);
		obj.SetCity(city);
		obj.SetState(state);		
	}
	public Address GetTempAddress()
	{
		return obj;	//return object of inner class (Address)
	}

	public void SetPermAddress(String name,String street,String city,String state)
	{
		obj.SetName(name);
		obj.SetStreet(street);
		obj.SetCity(city);
		obj.SetState(state);		
	}
	public Address GetPermAddress()
	{
		return obj;	//return object of inner class (Address)
	}


	class Address	//inner class 
	{
		private String name, street, city, state;

		public String GetName()
		{
			return name;
		}
		public void SetName(String name)
		{
			this.name = name;
		}

		public String GetStreet()
		{
			return street;
		}
		public void SetStreet(String street)
		{
			this.street = street;
		}

		public String GetCity()
		{
			return city;
		}
		public void SetCity(String city)
		{
			this.city = city;
		}

		public String GetState()
		{
			return state;
		}
		public void SetState(String state)
		{
			this.state = state;
		}
	}
}

class TestAddress
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		long phone = 0;	

		System.out.println("Enter Permenant address");

		System.out.println("Enter House name");
		String Pname = sc.next();

		System.out.println("Enter the street");
		String Pstreet = sc.next();

		System.out.println("Enter the city");
		String Pcity = sc.next();

		System.out.println("Enter the state");
		String Pstate = sc.next();

		System.out.println("Enter temporary address");

		System.out.println("Enter House name");
		String Tname = sc.next();

		System.out.println("Enter the street");
		String Tstreet = sc.next();

		System.out.println("Enter the city");
		String Tcity = sc.next();

		System.out.println("Enter the state");
		String Tstate = sc.next();

		System.out.println("Enter Phone Number");
//if user enter character insteed of numeric value then our program throws exception and terminate abnormally
//to avoid abnormal termination we use exception handling 
		try
		{
			phone = sc.nextLong();
		}
		catch(InputMismatchException E)
		{
			System.out.println(E);
		}

		AddressBook obj = new AddressBook();	//creating object of outer class (AddressBook)


		obj.SetTempAddress(Tname,Tstreet,Tcity,Tstate);

		System.out.println("Temparory Address");

//As from our GetTempAddress() method we return object of inner class hence to store that object we requre inner 
//class reference which is used to hold object of inner class

		AddressBook.Address Tobj = obj.GetTempAddress();

		System.out.println("House name : "+Tobj.GetName());

		System.out.println("Street : "+Tobj.GetStreet());

		System.out.println("City : "+Tobj.GetCity());

		System.out.println("State : "+Tobj.GetState());


		obj.SetPermAddress(Pname,Pstreet,Pcity,Pstate);

		System.out.println("Permanant Address");

		AddressBook.Address Pobj = obj.GetPermAddress();

		System.out.println("House name : "+Pobj.GetName());

		System.out.println("Street : "+Pobj.GetStreet());

		System.out.println("City: "+Pobj.GetCity());

		System.out.println("State : "+Pobj.GetState());

		obj.SetPhoneNumber(phone);

		System.out.println("Phone Number : "+obj.GetPhoneNumber());

		
	}
}

