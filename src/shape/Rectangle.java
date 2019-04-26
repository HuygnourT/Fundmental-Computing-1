package shape;

import java.util.Scanner;

public class Rectangle extends Shape
{
	private double length,width;
	public void setLength(double length)
	{
		if(length <=0) this.length = 0;
		else
		this.length = length;
	}
	public void setWidth(double width)
	{
		if(width <=0) this.width = 0;
		else
		this.width = width;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	@Override
	public double area() 
	{
		return length*width;
	}
	public double perimeter() 
	{
		return (length+width)*2;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		this.setLength(in.nextDouble());
		System.out.println("Enter the width of rectangle : ");
		this.setWidth(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Area of rectangle is "+this.area());
		System.out.println("Primeter of rectangle is "+this.perimeter());
	}
}
