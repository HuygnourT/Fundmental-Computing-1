package shape;
import java.util.*;
public class Square extends Rectangle{
	public Square()
	{
		super();
	}
	public Square(double edge)
	{
		super(edge,edge);
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the edge : ");
		width = length = in.nextDouble();
	}
	public void output()
	{
		System.out.println("Area of rectangle is "+this.area());
		System.out.println("Primeter of rectangle is "+this.perimeter());
	}
}
