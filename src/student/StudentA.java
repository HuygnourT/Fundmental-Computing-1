package student;
import java.util.Scanner;
public class StudentA extends Student{
	protected double mathematics,physics,chemistry;
	public double average()
	{
		return (mathematics + physics + chemistry )/ 3;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		super.input();
//		System.out.println("Enter mathematic : ");
//		mathematics = in.nextDouble();
//		System.out.println("Enter physics : ");
//		physics = in.nextDouble();
//		System.out.println("Enter chemistry : ");
//		chemistry = in.nextDouble();
	}
	public void output()
	{
		super.output();
//		System.out.println("Mathematics : "+mathematics);
//		System.out.println("Physics : "+physics);
//		System.out.println("Chemistry : "+chemistry);
//		System.out.println("Rank : "+rank());
	}
}
