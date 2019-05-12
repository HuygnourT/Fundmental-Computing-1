package square_equation;
import java.util.*;
public class LinerEquation 
{
	protected double b,c;
	public LinerEquation()
	{
		
	}
	public LinerEquation(double b,double c)
	{
		setB(b);
		setC(c);
	}
	public void setB(double bb)
	{
		b = bb;
	}
	public void setC(double cc)
	{
		c = cc;
	}
	public void solve()
	{
		System.out.println("To solve Liner Equation "+b+"x+"+c+" = 0");
		if(b == 0)
			if(c == 0)
				System.out.println("Unlimited roots");
			else System.out.println("No root");
		else System.out.printf(" x =  %.2f\n",(-c/b)); 
	}
	public String solve2()
	{
		if(b == 0)
			if(c == 0)
				return "Unlimited Roots";
			else  return "No root";
		else return " x =  "+(-c/b); 
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter b : ");
		setB(in.nextDouble());
		System.out.println("Enter c : ");
		setC(in.nextDouble());
	}
	public void f(int a,int b)
	{
		System.out.println((a+b));
	}
	public void f(int a,int b,int c)
	{
		System.out.println((a+b+c));
	}
	public void f1(int a,int b)
	{
		System.out.println((a*b));
	}
	public static void main(String[] args) 
	{	
		//New Object LineEquatation with attribute and method rieng biet
		LinerEquation x1 = new LinerEquation();
		x1.setB(6);
		x1.setC(5);
		x1.solve();
		
		LinerEquation x2 = new LinerEquation();
		x2.setB(0);
		x2.setC(5);
		x2.solve();
		
		LinerEquation x3 = new LinerEquation();
		x3.setB(0);
		x3.setC(5);
		x3.solve();

	}

}
