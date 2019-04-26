package square_equation;

import java.util.*;

public class SquareEquation extends LinerEquation
{
	private double a;
	public SquareEquation()
	{
		super();
	}
	public SquareEquation(double a,double b,double c)
	{
		super(b,c);
		setA(a);
	}
	public void setA(double a)
	{
		this.a = a;
	}
	
	public double getA()
	{
		return a;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		setA(in.nextDouble());
		super.input();
	}
	@Override
	public void solve()
	{
		if(a==0)
			super.solve();
		else 
		{	
			System.out.println("Square Equation "+a+"x^2+ "+b+" x + "+c+"= "+0);
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta  == 0 )
				System.out.println("x = "+(-b)/2/a);
			else if(delta > 0) 
			{
				System.out.println("x1 = "+(-b-Math.sqrt(delta))/2/a);
				System.out.println("x2 = "+(-b+Math.sqrt(delta))/2/a);
			} else System.out.println("No root");		
				
		}
	}
	
	@Override
	public void f(int a,int b)
	{
		System.out.println((a-b));
	}
	public void f(int a,int b,int c)
	{
		System.out.println((a-b-c));
	}
	public void f2(int a,int b)
	{
		System.out.println((a+b));
	}
	public static void main(String[] args)
	{
		SquareEquation x1 = new SquareEquation(0,5,7);
		x1.solve();
		
		SquareEquation x2 = new SquareEquation(2,5,7);

		x2.solve();
		
		SquareEquation x3 = new SquareEquation();
		x3.input();
		x3.solve();
		
	}
	
}
