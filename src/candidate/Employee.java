package candidate;

import java.util.*;

public class Employee extends Person  {
	protected String id,position;
	protected double allowance;
	public Employee()
	{
		super();
		this.id = "";
		this.position = "";
		this.phoneNumber = "";
	}
	public Employee(String id,String fullName ,String position, boolean gender,String phoneNumber,double allowance)
	{
		super(fullName,phoneNumber,gender);
		setID(id);
		setPosition(position);
		setAllowance(allowance);
	}
	public void setID(String id)
	{
		this.id = id;
	}
	public String getID()
	{
		return this.id;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition()
	{
		return this.position;
	}
	public void setAllowance(double allowance)
	{
		this.allowance = allowance;
	}
	public double getAllowance()
	{
		return this.allowance;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.println("Enter id :");
		this.setID(in.nextLine());
		System.out.println("Enter position of employee : ");
		this.setPosition(in.nextLine());
		System.out.println("Enter allowance  : ");
		this.setAllowance(in.nextDouble());

	}
	public void output()
	{
		super.output();
		System.out.println("ID : "+this.getID());
		System.out.println("Position : "+this.getPosition());
		System.out.println("Allowance : "+this.getAllowance());
	}
	public double computeSalary()
	{
		return 0;
	}
	public static void main(String[] args) {
		Employee a1 = new Employee();
//		a1.input();
//		a1.output();
//		Employee a2 = new Employee("0003","Alice Elodie","My Bitch",false,"007766",900);
//		a2.output();
	}

}
