package complex_numbers;

import java.util.*;
public class ComplexNumbers {
	private double virtual,real;
	public ComplexNumbers(){
		
	}
	public ComplexNumbers(double virtual,double real){
		setVirtual(virtual);
		setReal(real);
	}
	public void setVirtual(double virtual)
	{
		this.virtual = virtual;
	}
	public void setReal(double real)
	{
		this.real = real;
	}
	public double getVirtual()
	{
		return this.virtual;
	}
	public double getReal()
	{
		return this.real;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value virtual : ");
		double a = in.nextDouble();
		setVirtual(a);
		System.out.println("Enter the value real : ");
		double b = in.nextDouble();
		setReal(b);
	}
	public String output()
	{
		String output = "("+getVirtual() +" + "+getReal()+"i)";
		//System.out.println(getVirtual()+" + "+getReal()+"i");
		return output;
	}
	public ComplexNumbers plus(ComplexNumbers b)
	{
		System.out.print(this.output()+" + "+b.output()+" = ");
		ComplexNumbers c = new ComplexNumbers();
		c.setVirtual(this.getVirtual() + b.getVirtual());
		c.setReal(this.getReal() + b.getReal());
		return c;
	}
	public ComplexNumbers minus(ComplexNumbers b)
	{
		System.out.print(this.output()+" - "+b.output()+" = ");
		ComplexNumbers c = new ComplexNumbers();
		c.setVirtual(this.getVirtual() - b.getVirtual());
		c.setReal(this.getReal() - b.getReal());
		return c;
	}
	public ComplexNumbers multiply(ComplexNumbers b)
	{
		System.out.print(this.output()+" * "+b.output()+" = ");
		ComplexNumbers c = new ComplexNumbers();
		c.setVirtual(this.getVirtual()*b.getVirtual()-this.getReal()*b.getReal());
		c.setReal(this.getVirtual()*b.getReal()+this.getReal()*b.getVirtual());
		return c;
	}
	public ComplexNumbers division(ComplexNumbers b)
	{
		System.out.print(this.output()+" / "+b.output()+" = ");
		ComplexNumbers c = new ComplexNumbers();
		//Math.pow(b.getA(), 2) + Math.pow(b.getB(), 2)
		c.setVirtual((this.getVirtual()*b.getVirtual()+ this.getReal()*b.getReal())/
				(Math.pow(b.getVirtual(), 2) + Math.pow(b.getReal(), 2)));
		c.setReal((this.getReal()*b.getVirtual() -  this.getVirtual()*b.getReal())/
				(Math.pow(b.getVirtual(), 2) + Math.pow(b.getReal(), 2)));
		return c;
	}
	public static void main(String[] args) 
	{
		ComplexNumbers a = new ComplexNumbers();
		a.input();
		System.out.println(a.output());
		ComplexNumbers b = new ComplexNumbers();
		b.input();
		System.out.println(b.output());
		System.out.println(a.plus(b).output());
		System.out.println(a.minus(b).output());
		System.out.println(a.multiply(b).output());
		System.out.println(a.division(b).output());
	}

}
