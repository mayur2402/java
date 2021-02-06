import java.util.*;
interface shape
{
	double area();
}
class circle implements shape
{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return java.util.Math.PI*radius*radius;
	}
}
class cylinder implements shape
{
	double height;
	cylinder(double radius,double height)
	{		
		super(radius);
		this.height=height;
	}
	public double area()
	{
		return java.util.Math.PI*radius*radius*height;
	}
}
public class Shape
{
	shape s;
	s=new circle(5.2);
	system.out.println("Area of circle="+s.area());
	s=new cylinder(5.2,2.5);
	system.out.println("Area of cylinder="+s.area());
}
}
