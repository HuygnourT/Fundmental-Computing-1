package equipment;
import java.util.*;
public class TablePhone extends ElectronicEquipment {
	public TablePhone()
	{
		this.name = "";
	}
	public TablePhone(String name,double price,double weight)
	{
		setName(name);
		setPrice(price);
		setWeight(weight);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String name()
	{
		return this.name;
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
	
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name of phone : ");
		setName(in.nextLine());
		System.out.print("Enter weight: ");
		setWeight(in.nextDouble());
		System.out.print("Enter price : ");
		setPrice(in.nextDouble());
	}
	public void output()
	{
		System.out.println("Name of device: "+this.name());
		System.out.println("Weight : "+this.weight());
		System.out.println("Price : "+this.weight());
	}
	public static void main(String[] args) {
	}
}
