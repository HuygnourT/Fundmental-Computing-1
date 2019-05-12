package student;
import java.util.Scanner;
public class StudentB extends Student{
	protected double literature,history,geography;
	public double average()
	{
		return (literature + history + geography )/ 3;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		super.input();
//		System.out.println("Enter literature : ");
//		literature = in.nextDouble();
//		System.out.println("Enter history : ");
//		history = in.nextDouble();
//		System.out.println("Enter geography : ");
//		geography = in.nextDouble();
	}
	public void output()
	{
		super.output();
//		System.out.println("Literature : "+literature);
//		System.out.println("History : "+history);
//		System.out.println("Geography : "+geography);
//		System.out.println("Rank : "+rank());
	}
}
