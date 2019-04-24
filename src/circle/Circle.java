package circle;

public class Circle 
{	
	
	
	public static void main(String[] args)
	{
		//declare r1 
		Circle r1 = new Circle();
		System.out.println("Area of circle 1 is "+r1.area());
		System.out.println("Primeter of circle 1 is "+r1.primeter());
		
		//declare r2
		Circle r2 = new Circle(9);
		System.out.println("Area of circle 2 is "+r2.area());
		System.out.println("Primeter of circle 2 is "+r2.primeter());
	}
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
	public double area() //get area
	{
		return radius * radius * Math.PI;
	}
	public double primeter()//get primeter
	{
		return radius * 2 * Math.PI;
	}
}
