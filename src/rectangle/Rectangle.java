package rectangle;

public class Rectangle 
{
	//khai bao thuoc tinh
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
	//cai dat phuong thuc
	public double area() 
	{
		return length*width;
	}
	public double perimeter() 
	{
		return (length+width)*2;
	}
	public static void main(String[] args)
	{	
		//tao cac doi tuong co gia tri cu the rieng
		Rectangle r1 = new Rectangle();
		r1.setLength(2);
		r1.setWidth(8);
		System.out.println("Area r1 is "+r1.area());
		System.out.println("Primeter r1 is "+r1.perimeter());
		
		Rectangle r2 = new Rectangle();
		r2.setLength(5);
		r2.setWidth(7);
		System.out.println("Area r2 is "+r2.area());
		System.out.println("Primeter r2 is "+r2.perimeter());
	}
}
