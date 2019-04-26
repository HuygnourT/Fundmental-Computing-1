package candidate;

import java.util.*;

public class Contract extends Employee{
	private double gradeOfSalary;
	public Contract()
	{
		super();
	}
	public Contract(String id,String fullName ,String position, 
			boolean gender,String phoneNumber,double allowance,double gradeOfSalary)
	{
		super(id,fullName,position,gender,phoneNumber,allowance);
		this.setGradeOfSalary(gradeOfSalary);
	}
	public void setGradeOfSalary(double gradeOfSalary)
	{
		this.gradeOfSalary = gradeOfSalary;
	}
	public double getGradeOfSalary()
	{
		return this.gradeOfSalary;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		//super.input();
		System.out.println("Enter the grade of salary : ");
		this.setGradeOfSalary(in.nextDouble());
	}
	public void output()
	{
		//super.output();
		System.out.println("The Grade Of Salary : "+this.getGradeOfSalary());
		System.out.println("Salary : "+this.computeSalary());
	}
	public double computeSalary()
	{
		return this.getAllowance()+this.getGradeOfSalary();
	}
	public static void main(String[] args) {
		Contract a1 = new Contract();
		a1.input();
		a1.output();
	}

}
