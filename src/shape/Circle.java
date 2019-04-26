package shape;

import java.util.*;

public class Circle extends Shape
{	
	private double radius;
	public Circle()
	{
		setRadius(1);
	}
	public Circle(double newRadius)
	{
		setRadius(newRadius);
	}
	public void setRadius(double radius)
	{	if(radius > 0)
			this.radius = radius;
		else 
			this.radius = 0;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		this.setRadius(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Area of circle is "+this.area());
		System.out.println("Primeter of circle is "+this.perimeter());
	}
	public double area() //get area
	{
		return radius * radius * Math.PI;
	}
	public double perimeter()//get perimeter
	{
		return radius * 2 * Math.PI;
	}
}
