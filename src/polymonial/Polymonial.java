package polymonial;
import java.util.*;
public class Polymonial {
	private double coefficient,exponent;
	public void setCoefficient(double coefficient)
	{
		this.coefficient = coefficient;
	}
	public void setExponent(double exponent)
	{
		if(exponent <= 0) 
			this.exponent =1;
		else 
			this.exponent = exponent;
	}
	public double getCoefficient()
	{
		return this.coefficient;
	}
	public double getExponent()
	{
		return this.exponent;
	}
	public void input()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of coefficient : ");
		setCoefficient(in.nextDouble());
		
		System.out.println("Enter the value of exponent: ");	
		setExponent(in.nextDouble());	
	}
	public String toString()
	{
		String output = this.coefficient+"x^"+this.exponent;
		return output;
	}
	public double f(double x)
	{
		return this.coefficient*Math.pow(x, exponent);
	}
	public double ff(double x)
	{
		return this.coefficient*this.exponent*Math.pow(x,exponent-1);
	}
	public void output(double x)
	{
		System.out.println("f(x) = "+this.toString()+"\nf("+x+") = "+this.f(x)+
				"\nf'("+x+") = "+this.ff(x));
	}
	public static void main(String[] args) {
		Polymonial x1 = new Polymonial();
		x1.input();
		x1.output(7);
	}

}
