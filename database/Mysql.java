import java.io.*;
import java.lang.*;
import java.sql.*;
import java.util.*;

public class Mysql
{
	public Connection conn = null;
	public Statement stmt = null;
	public BufferedReader br = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	public Mysql()
	{
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Enter database");
			String database = br.readLine();
			System.out.println("Enter username");
			String username = br.readLine();
			System.out.println("Enter password");
			String password = br.readLine();


			String url = "jdbc:mysql://localhost:3306/"+database;

			conn = DriverManager.getConnection(url,username,password);
			if(conn == null)
			{
				System.out.println("Connection failed");
				System.exit(0);
			}
			System.out.println("connected");
			stmt = conn.createStatement();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		try
		{
			ResultSet rs = stmt.executeQuery("select * from Employee");
			System.out.println("Employee Id\tEmployee Name");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insert()
	{
		try
		{
			System.out.println("Enter Employee id");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee name");
			String name = br.readLine();

			ps = conn.prepareStatement("insert into Employee values(?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.execute();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void delete()
	{
		try
		{
			System.out.println("Enter employee id to delete employee");
			int id = Integer.parseInt(br.readLine());
			stmt.execute("delete from Employee where id = "+id);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void updateName()
	{
		try
		{
			System.out.println("Enter employee id to update name");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter employee name to update");
			String name = br.readLine();
			
			ps = conn.prepareStatement("update Employee set name = ? where id = ?");
			ps.setInt(2,id);
			ps.setString(1,name);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}