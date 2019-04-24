package fraction;

import java.util.*;

public class Fraction 
{
	//Khong khai bao scanner o day vi scanner khong phai thuoc tinh chung cua tat ca cac thuoc tinh cua class
	private Integer numerator,denominator;
	public Fraction()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	public Fraction(Integer n,Integer d)
	{
		setNumerator(n);
		setDenominator(d);
	}
	public void setNumerator(Integer n)
	{
		this.numerator = n;
	}
	public void setDenominator(Integer d)
	{
		if(d==0)
			this.denominator = 1;
		else this.denominator = d;
	}
	public Integer getNumerator()
	{
		return numerator;
	}
	public Integer getDenominator()
	{
		return this.denominator;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numerator : ");
		int n = in.nextInt();
		this.setNumerator(n);
		System.out.println("Enter denominator : ");
		int d = in.nextInt();
		while(d==0)
		{
			System.out.println("Enter denominator : ");
			d=in.nextInt();
		}
		this.setDenominator(d);
	}
	public void output()
	{
		System.out.print(this.numerator+"/"+this.denominator+"    ");
	}
	public String toString()
	{
		String output = this.numerator+"/"+this.denominator;
		return output;
	}
	public double divide()
	{
		return 1.0*this.getNumerator()/this.getDenominator();
	}
	public Fraction plus(Fraction f2)
	{
		//System.out.print(this.toString()+" + "+f2.toString()+" = ");
		Fraction f3 = new Fraction();
		f3.setNumerator(this.getDenominator()*f2.getNumerator() + this.getNumerator()*f2.getDenominator());
		f3.setNumerator(f3.getNumerator());
		f3.setDenominator(this.getDenominator() * f2.getDenominator());
		f3.setDenominator(f3.getDenominator());
		return f3;
	}
	public Fraction minus(Fraction f2)
	{
//		System.out.print(this.toString()+" - "+f2.toString()+" = ");
		Fraction f3 = new Fraction();
		f3.setNumerator(this.getNumerator()*f2.getDenominator() - f2.getNumerator()*this.getDenominator());
		f3.setDenominator(this.getDenominator() * f2.getDenominator());
		return f3;
	}
	public Fraction multiply(Fraction f2)
	{
//		System.out.print(this.toString()+" * "+f2.toString()+" = ");
		Fraction f3 = new Fraction();
		f3.setNumerator(this.getNumerator()*f2.getNumerator());
		f3.setDenominator(this.getDenominator() * f2.getDenominator());
		return f3;
	}
	public Fraction division(Fraction f2)
	{
//		System.out.print(this.toString()+" / "+f2.toString()+" = ");
		Fraction f3 = new Fraction();
		f3.setNumerator(this.getNumerator() * f2.getDenominator());
		if(f2.getNumerator() == 0)
		{
			f3.numerator = null;
			f3.denominator = null;
		}
		else 
		f3.setDenominator(this.getDenominator() * f2.getNumerator());
		return f3;
	}
	public Fraction minimalistFraction()
	{

		int d = this.getDenominator();
		int n = this.getNumerator();
		while(d != n)
			if(Math.abs(d) > Math.abs(n) )
				d = Math.abs(d)-Math.abs(n) ;
			else n = Math.abs(n)-Math.abs(d);
		Fraction f = new Fraction(this.getNumerator()/d,this.getDenominator()/d);
		return f;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		f1.input();
		f1.output();
		Fraction f2 = new Fraction();
		f2.input();
		f2.output();
		f1.plus(f2).minimalistFraction().output();
//		f1.minus(f2).output();
//		f1.multiply(f2).output();
//		f1.division(f2).output();
	}

}
