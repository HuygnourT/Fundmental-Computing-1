package triangle;

public class Triangle 
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
	public void setA(double aa)
	{
		if(aa>0)
			a = aa;
		else 
			a = 0;
	}
	public void setB(double bb)
	{
		if(bb>0)
			b = bb;
		else 
			b = 0;
	}
	public void setC(double cc)
	{
		if(cc>0)
			c = cc;
		else 
			c = 0;
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
	public Double primeter()
	{	
		if(isTriangle())
			return (a+b+c);
		return null;
		
			
	}
	public Double area()
	{
		
		if(isTriangle())
		{
			double p = primeter() / 2;
			
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}	 
			return null;
				
		
	}
	public static void main(String[] args)
	{
		Triangle delta1 = new Triangle(12,14,10);
		System.out.println("This primeter of delta1 triangle is "+delta1.primeter());
		System.out.println("This area of delta1 triangle is "+delta1.area());
	}
}
