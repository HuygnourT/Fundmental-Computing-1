package shape;

import java.util.Scanner;

public class Triangle extends Shape
{
	private double a,b,c;
	public Triangle()
	{
		
	}
	public Triangle(double a,double b,double c)
	{
		setA(a);
		setB(b);
		setC(c);
	}
	public void setA(double a)
	{
		if(a>0)
			this.a = a;
		else 
			this.a = 0;
	}
	public void setB(double b)
	{
		if(b>0)
			this.b = b;
		else 
			this.b = 0;
	}
	public void setC(double c)
	{
		if(c>0)
			this.c = c;
		else 
			this.c = 0;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public boolean isTriangle() 
	{
		if(( a + b >= c) && ( b + c >= a ) && ( c + a >= b))
			return true;
		return false;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a : ");
		this.setA(in.nextDouble());
		System.out.println("Enter b : ");
		this.setB(in.nextDouble());
		System.out.println("Enter c : ");
		this.setC(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Area of triangle is "+this.area());
		System.out.println("Primeter of triangle is "+this.perimeter());
	}
	public double perimeter()
	{	
		if(isTriangle())
			return (a+b+c);
		return 0;
	}
	public double area()
	{
		
		if(isTriangle())
		{
			double p = perimeter() / 2;
			
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}	 
			return 0;
	}
	public static void main(String[] args)
	{
		Triangle delta1 = new Triangle(12,14,10);
		System.out.println("This primeter of delta1 triangle is "+delta1.perimeter());
		System.out.println("This area of delta1 triangle is "+delta1.area());
	}
}
