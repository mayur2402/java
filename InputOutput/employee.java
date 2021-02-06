import java.io.*;
class employee
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter id of employee");
		int i= Integer.parseInt(br.readLine());
		System.out.println("\nEnter gender of employee(M/F)");
		char c=br.readLine().charAt(0);
		System.out.println("\nEnter name of employee");
		String n= br.readLine();
		System.out.println("ID is\t"+i);
		System.out.println("Gender is\t"+c);
		System.out.println("Name is\t"+n);
	}
}
