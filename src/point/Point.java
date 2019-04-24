package point;
import java.util.*;
public class Point {
	private double x,y;
	public Point()
	{
		
	}
	public Point(double x,double y)
	{
		setX(x);
		setY(y);
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input coordinate of x : ");
		double x = in.nextDouble();
		setX(x);
		System.out.println("Input coordinate of y : ");
		double y = in.nextDouble();
		setY(y);
	}
	public void output()
	{
		System.out.println("["+this.x+","+this.y+"]");
	}
	public double distance(Point b)
	{
		return Math.sqrt(Math.pow(this.getX()-b.getX(), 2)+Math.pow(this.getY()-b.getY(), 2));
	}
	public boolean isTriangle(double ab,double bc,double ac)
	{
		if((ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab))
			return true;
		else return false;
	}
	public double area(Point b,Point c)
	{
		double ab,bc,ac;
		ab = this.distance(b);
		bc = b.distance(c);
		ac = this.distance(c);
		if(isTriangle(ab,bc,ac))
		{
		double halfPerimeter = (ab + bc + ac) / 2;
		return Math.sqrt(halfPerimeter*
				(halfPerimeter-ab)*
				(halfPerimeter-bc)*
				(halfPerimeter-ac));
		}
		else return 0;
	}
	public String toString()
	{
		return "["+this.getX()+" , "+this.getY()+ "]" ;
	}
	public static void main(String[] args)
	{
		Point p1 = new Point();
		p1.input();
		p1.output();
		Point p2 = new Point();
		p2.input();
		p2.output();
		Point p3 = new Point();
		p3.input();
		p3.output();
		System.out.println("Length of AB : "+p1.distance(p2));
		System.out.println("Length of AC : "+p1.distance(p3));
		System.out.println("Length of BC : "+p2.distance(p3));
		System.out.println("The area of this triangle is : "+p1.area(p2,p3));
	}
}
