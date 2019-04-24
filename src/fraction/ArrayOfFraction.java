package fraction;

import java.util.Scanner;
public class ArrayOfFraction {
	private int n;
	private Fraction[] a = new Fraction[100];
	public ArrayOfFraction()
	{
		
	}
	public ArrayOfFraction(int n)
	{
		this.setN(n);
	}
	public void setN(int n)
	{
		if(n > 0 ) this.n = n;
		else this.n = 1;
	}
	public int getN()
	{
		return this.n;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array of fraction ");
		this.setN(in.nextInt());
		for(int i = 0 ; i < this.getN(); i++)
		{
			System.out.println("Enter the fraction "+(i+1));
			Fraction f = new Fraction();
			f.input();
			a[i] = f;
		}
	}
	public void max()
	{
		double max = a[0].divide();
		int vt = 0;
		for(int i = 0 ; i < this.n ; i++)
			if(max < a[i].divide())
			{
				max = a[i].divide();
				vt = i;
			}
		System.out.println("The value max in array of fraction is "+a[vt].divide());
	}
	public void sumMax1()
	{
		double max = //a[0].divide()+a[1].divide();
				a[0].plus(a[1]).divide();
		for(int i = 1 ; i < n-1 ; i++)
			if(a[i].plus(a[i+1]).divide() > max)
				max = a[i].plus(a[i+1]).divide();
		System.out.println("The sum of two largest continuos fractions is "+max);
	}
	public void sumMax2()
	{
		int max1 = (a[1].divide() > a[0].divide()) ? 1 : 0;
		int max2 = (a[1].divide() > a[0].divide()) ? 0 : 1;
		for(int i = 2 ; i < n ; i++) 
		{
			if(a[i].divide() > a[max1].divide())
			{
				max2 = max1;
				max1 = i;
			} 
			if(a[i].divide() > a[max2].divide() && i != max1 )
				max2 = i;
		}
		System.out.println("The sum of maximum of two biggest fraction is "+(a[max1].divide()+a[max2].divide()));
	}
	public boolean search(Fraction f)
	{
		for(int i = 0 ; i < n ; i++)
			if(f.divide() == a[i].divide())
				return true;
		return false;
	}
	public void remove(int index)
	{
		//System.out.println("Remove the position "+index);
		for(int i = index ; i < n-1 ; i++)
			a[i] = a[i+1];
		this.n--;
	}
	public void insert(Fraction f,int index)
	{
		System.out.println("Insert "+f.toString()+" to position"+index);
		for(int i = this.n ; i > index ; i--)
			a[i] = a[i-1];
		a[index] = f;
		this.n++;
	}
	public void bubbleSort()
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n-1 ; j++)
			{
				if(a[j].divide() > a[j+1].divide())
				{
					Fraction tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		output();
	}
	public void output()
	{
		for(int i = 0 ; i < this.getN(); i++)
			a[i].output();
		System.out.println();
	}
	public Fraction sumAll()
	{
		Fraction f = a[0].plus(a[1]);
		for(int i = 2 ; i < n ; i++)
			f = f.plus(a[i]);
		return f;
	}
	public void removeNumeratorEven()
	{
		System.out.println("Remove numerator even : ");
		for(int i = 0 ; i < n ; i++)
			if(a[i].getNumerator() % 2 == 0)
			{
				remove(i);
				i--;
			}
		output();
	}
	public void denominatorOdd()
	{
		System.out.println("Denominator odd : ");
		for(int i = 0 ; i < n ; i++)
			if(a[i].getDenominator() % 2 == 1)
				System.out.print(a[i].toString()+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayOfFraction arr = new ArrayOfFraction();
		arr.input();
		arr.output();
		arr.sumMax1();
		arr.sumMax2();
		System.out.println("The fraction 5/3 is in the array of fraction ? "+arr.search(new Fraction(5,3)));
		arr.remove(3);
		arr.output();
		arr.insert(new Fraction(5,3), 3);
		arr.output();
		arr.bubbleSort();
		System.out.println("The sum of array of integer is "+arr.sumAll().minimalistFraction());
		arr.removeNumeratorEven();
		arr.denominatorOdd();
		
	}

}
