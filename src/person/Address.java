package person;

import java.util.*;
public class Address {
	private String number,street,district,city;//null
	public Address()
	{
		this.number ="";
		this.street ="";
		this.district = "";
		this.city = "";
	}
	public Address(String number,String street, String district, String city)
	{
		this.setNumber(number);
		this.setStreet(street);
		this.setDistrict(district);
		this.setCity(city);
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public void setDistrict(String district)
	{
		this.district = district;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getNumber()
	{
		return this.number;
	}
	public String getStreet()
	{
		return this.street;
	}
	public String getDistrict()
	{
		return this.district;
	}
	public String getCity()
	{
		return this.city;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of address : ");
		this.setNumber(in.nextLine());
		System.out.println("Enter the street of address : ");
		this.setStreet(in.nextLine());
		System.out.println("Enter the district of address : ");
		this.setDistrict(in.nextLine());
		System.out.println("Enter the city of address : ");
		this.setCity(in.nextLine());
	}
	public void output()
	{
		System.out.println("Address : " +this.getNumber()+" "+this.getStreet()+" "+this.getDistrict()+" "+this.getCity());
	}
	public static void main(String[] args) 
	{
		Address a1 = new Address();
		a1.input();
		a1.output();
		Address a2 = new Address("209","phan thanh","thanh khe","da nang");
		a2.output();
		String number = "254";
		String street = "nguyen van linh";
		String district = "thanh khe";
		String city = "da nang";
		Address a3 = new Address(number,street,district,city);
		a3.output();
		System.out.println(a3);
		Address a4 = a3;
		a4.output();
		System.out.println(a4);
	}
}
