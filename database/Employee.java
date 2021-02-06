import java.lang.*;
import java.util.*;

class Employee
{
	private int id;
	private String name;
	public static void main(String args[])
	{
		try
		{
			int ch = 0,mysqlch = 0,postgresch = 0;
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.println("1.Mysql\n2.Postgresql\n3.exit\nEnter your choice");
				ch = sc.nextInt();
				switch(ch)
				{
					case 1:
					Mysql mysql = new Mysql();
					do
					{
						System.out.println("1.insert\n2.display\n3.delete\n4.update name\n5.exit\nEnter your choice");
						mysqlch = sc.nextInt();
						switch(mysqlch)
						{
							case 1:
							mysql.insert();
							break;

							case 2:
							mysql.display();
							break;

							case 3:
							mysql.delete();
							break;

							case 4:
							mysql.updateName();
							break;

							default:
							mysql.conn.close();
							break;
						}
					}while(mysqlch != 5);
					break;

					case 2:
					Postgresql postgresql = new Postgresql();
					do
					{
						System.out.println("1.insert\n2.display\n3.delete\n4.update name\n5.exit\nEnter your choice");
						postgresch = sc.nextInt();
						switch(postgresch)
						{
							case 1:
							postgresql.insert();
							break;

							case 2:
							postgresql.display();
							break;

							case 3:
							postgresql.delete();
							break;

							case 4:
							postgresql.updateName();
							break;

							default:
							postgresql.conn.close();
							break;
						}
					}while(postgresch != 5);
					break;

					case 3:
					System.out.println("Thanks for using application");
					break;

					default :
					System.out.println("Enter Valid choice");
					break;
				}
			}while(ch != 3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}