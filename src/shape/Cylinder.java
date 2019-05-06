package shape;
import java.util.*;
public class Cylinder extends Circle {
	protected double height;
	public Cylinder()
	{
		super();
		this.height = 1;
	}
	public Cylinder(double radius,double h)
	{
		super(radius);
		this.height = h;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double surroundingArea()
	{
		return this.perimeter()*this.getHeight();
	}
	@Override
	public double area()
	{
		return super.area() * 2 + this.surroundingArea();
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.println("Enter height : ");
		this.setHeight(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Surrounding area : "+this.surroundingArea());
		System.out.println("Full area : "+this.area());
	}
	
}
