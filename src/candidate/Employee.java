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
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id :");
		this.setID(in.nextLine());
//		System.out.println("Enter name of employee : ");
//		this.setFullName(in.nextLine());
		System.out.println("Enter position of employee : ");
		this.setPosition(in.nextLine());
//		System.out.println("Enter gender : ( male / female ) ");
//		this.setGender(in.next().equalsIgnoreCase("male") ? true : false);
//		System.out.println("Enter phone number : ");
//		this.setPhoneNumber(in.next());
		System.out.println("Enter allowance  : ");
		this.setAllowance(in.nextDouble());
		super.input();
	}
	public void output()
	{
		System.out.println("ID : "+this.getID());
		//System.out.println("Name : "+this.getFullName());
		System.out.println("Position : "+this.getPosition());
//		System.out.println("Gender : "+this.getGender());
//		System.out.println("Phone number : "+this.getPhoneNumber());
		System.out.println("Allowance : "+this.getAllowance());
		super.output();
	}
	public double computeSalary()
	{
		return 0;
	}
	public static void main(String[] args) {
		Employee a1 = new Employee();
		a1.input();
		a1.output();
//		Employee a2 = new Employee("0003","Alice Elodie","My Bitch",false,"007766",900);
//		a2.output();
	}

}
