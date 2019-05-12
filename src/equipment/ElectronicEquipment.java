package equipment;

public abstract class ElectronicEquipment 
{
	protected String name;
	protected double weight,price;
	public abstract void input();
	public abstract void output();
	public abstract String name();
}
