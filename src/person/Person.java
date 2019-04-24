package person;
import java.util.*;
public class Person extends Date{
	private String fullName,phoneNumber;
	private boolean gender;
	public Address add = new Address();
	public Date date = new Date();
	public void setDate(Date date)
	{
		this.date = date;
	}
	public void setDate()
	{
		super.input();
	}
	public void getDate()
	{
		System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
	}
	public Address getAddress()
	{
		return add;
	}
	public void setAddress(Address add)
	{
		this.add = add;
	}
	public Person()
	{
		this.fullName = "";
		this.phoneNumber ="";
	}
	public Person(String fullName,String phoneNumber,boolean gender,Address add,Date date)
	{
		setFullName(fullName);
		setPhoneNumber(phoneNumber);
		setGender(gender);
		setAddress(add);
		setDate(date);
	}
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	public String getFullName()
	{
		return this.fullName;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public void setGender(boolean gender)
	{
		this.gender = gender;
	}
	public boolean getGender()
	{
		return this.gender;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter full name : ");
		setFullName(in.nextLine());
		System.out.println("Enter phone number : ");
		setPhoneNumber(in.next());
		System.out.println("Enter gender ( male / female ) : ");
		setGender(in.next().equalsIgnoreCase("male") ? true : false);
		System.out.println("Enter address : ");
		add.input();
		date.input();
	}
	public void output()
	{
		System.out.println("Full name: "+this.fullName);
		System.out.println("Phone number : "+this.phoneNumber);
		System.out.println("Gender :  "+this.gender);
		add.output();
		getDate();
	}
	public static void main(String[] args) {

		Person p2 = new Person("Truong Phuc Huy","0935031325",true,new Address("4","Hoang Dieu","Hai Chau","Da Nang"),new Date(2,12,2000));
		p2.output();
//		Person p1 = new Person();
//		p1.input();
//		p1.output();
//		Person p3 = p1;
//		p3.output();
//		System.out.println(p3+"\n"+p1);
		
	}
	

}
