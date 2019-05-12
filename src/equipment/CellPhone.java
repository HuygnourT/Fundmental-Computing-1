package equipment;

import java.util.Scanner;

public class CellPhone extends TablePhone{
	protected String network,brand;
	public CellPhone()
	{
		super();
		this.network ="";
		this.brand = "";
	}
	public CellPhone(String name,String brand,double price,double weight,String network)
	{
		super(name,price,weight);
		this.setNetwork(network);
		this.setBrand(brand);
	}
	public void setNetwork(String network)
	{
		this.network = network;
	}
	public String network()
	{
		return this.network;
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
		super.input();
		System.out.print("Enter name of brand : ");
		this.setBrand(in.nextLine());
		System.out.print("Enter name of network : ");
		this.setNetwork(in.nextLine());
		
	}
	public void output()
	{
		super.output();
		System.out.println("Brand : "+this.brand());
		System.out.println("Network : "+this.network());
		
	}
}
