//Program to find area and circumference of circle.
import java.io.*;
import java.util.*;
class circle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		System.out.println("Area is"+(3.142*r*r));
		System.out.println("Circumference is"+(2*3.142*r));
	}
}
