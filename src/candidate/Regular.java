package candidate;
import java.util.*;
public class Regular extends Employee {
	private int yearOfExperience;
	private double rate,basicOfSalary;
	public Regular()
	{
		super();
	}
	public Regular(String id,String fullName ,String position, boolean gender,
			String phoneNumber,double allowance,int yearOfExperience, double basicOfSalary,Address add,Date date)
	{
		super(id,fullName,position,gender,phoneNumber,allowance,add,date);
		this.setYearOhExperience(yearOfExperience);
		this.setBasicOfSalary(basicOfSalary);
		this.setRate();
	}
	public void setYearOhExperience(int yearOfExperience)
	{
		this.yearOfExperience = yearOfExperience;
	}
	public int getYearOfExperience()
	{
		return this.yearOfExperience;
	}
	public void setRate()
	{
		this.rate = (this.getYearOfExperience() < 25 ) ? ( this.getYearOfExperience() / 3 * 0.33 + 2.33 ): ( 8 * 0.33 + 2.33 );
	}
	public void setRate2()
	{
		if(this.getYearOfExperience() > 25)
			this.rate = 2.33 + 8*0.33;
		else
		{
			this.rate = 2.33;
			for(int i = 3 ; i < this.getYearOfExperience() ; i+=3)
				this.rate+=0.33;	
		}
	}
	public double getRate()
	{
		return (int)(this.rate*100)/100.0;
	}
	public void setBasicOfSalary(double basicOfSalary)
	{
		this.basicOfSalary = basicOfSalary;
	}
	public double getBasicOfSalary()
	{
		return this.basicOfSalary;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		//super.input();
		System.out.println("Enter years of experience : ");
		this.setYearOhExperience(in.nextInt());
		setRate();
		System.out.println("Enter the basic of salary : ");
		this.setBasicOfSalary(in.nextDouble());
	}
	public void output()
	{
		//super.output();
		System.out.println("Years of experience : "+this.getYearOfExperience());
		System.out.println("The rate : "+this.getRate());
		System.out.println("Basic of salary : "+this.getBasicOfSalary());
		System.out.println("Salary : "+this.computeSalary());
	}
	public double computeSalary()
	{
		return this.getAllowance()+this.getRate()*this.getBasicOfSalary();
	}
	public static void main(String[] args) {
		Regular a1 = new Regular();
		a1.input();
		a1.output();
//		Regular a2 = new Regular("002","Elodie Alice","Secrectary",false,"113",500,2,3.0,2000);
//		a2.output();
	}

}