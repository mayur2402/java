import java.util.*;
public class ArrayListpro 
{
	public static void main(String args[])
	{
		ArrayList arr=new ArrayList();
		System.out.println("Initial size of array list is\t"+arr.size());
		arr.add("M");
		arr.add("A");
		arr.add("Y");
		arr.add("U");
		arr.add("R");

		System.out.println("After adding size is\t"+arr.size());
		System.out.println("Array list is\t"+arr);
		arr.remove("R");
		arr.remove(3);
		System.out.println("After removing size is\t"+arr.size());
		System.out.println("Array list is\t"+arr);
	}
}
