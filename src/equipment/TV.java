package equipment;

import java.util.Scanner;

public class TV extends ElectronicEquipment{
	protected String brand,quality;
	public TV()
	{
		this.name ="";
	}
	public TV(String name,String brand,String quality,double price,double weight)
	{
		this.setName(name);
		this.setBrand(brand);
		this.setPrice(price);
		this.setWeight(weight);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String name()
	{
		return this.name;
	}
	public void setQuality(String quality)
	{
		this.quality = quality;
	}
	public String quality()
	{
		return this.quality;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double price()
	{
		return this.price;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double weight()
	{
		return this.weight;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String brand()
	{
		return this.brand;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name of TV : ");
		setName(in.nextLine());
		System.out.println("Enter quality : ");
		setQuality(in.nextLine());
		System.out.println("Enter brand : ");
		setBrand(in.nextLine());
		System.out.print("Enter weight: ");
		setWeight(in.nextDouble());
		System.out.print("Enter price : ");
		setPrice(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Name of device: "+this.name());
		System.out.println("Brand : "+this.brand());
		System.out.println("Quality : "+this.quality());
		System.out.println("Weight : "+this.weight());
		System.out.println("Price : "+this.price());
	}
	
}
