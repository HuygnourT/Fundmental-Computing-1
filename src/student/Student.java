package student;
import java.util.*;
public abstract class Student implements Rank{
	protected String name,id,dob;
	public String rank()
	{
		if(average() >= 8)
			return "Good";
		else if(average() >= 7)
			return "Fairly Good";
		else if(average() >= 5)
			return "Average";
		else return "Fail";
	}
	public abstract double average();
	public void input()
	{
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter id : ");
//		id = in.nextLine();
		System.out.println("Enter name : ");
		name = in.nextLine();
//		System.out.println("Enter day of birth : ");
//		dob = in.nextLine();
	}
	public String name()
	{
		return this.name;
	}
	public void output()
	{
		//System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		//System.out.println("Day of birth : "+this.dob);
	}
}
