package candidate;
import java.util.*;
public class ArrayOfEmployee {
	private Employee[] list = new Employee[100];
	private int n;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of employee");
		n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the information of employee "+(i+1));
			System.out.println("1-Regular/2-Contract");
			int choose = in.nextInt();
			if(choose == 1)
				list[i] = new Regular();
			else if (choose == 2)
				list[i] = new Contract();
			list[i].input();
		}
	}
	public void output()
	{
		System.out.println("The list of employee : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("The information of employee "+(i+1));
			list[i].output();
		}
	}
	public void count()
	{
		int c1=0,c2=0;
		for(int i =0 ; i < n ; i++)
			if(list[i] instanceof Regular)
				c1++;
			else c2++;
		System.out.println("The number of regular employee is "+c1+"\nThe number of contract employee is "+c2);
	}
	public void minSalary()
	{
		double min = list[0].computeSalary();
		for(int i = 1 ; i < n ; i++)
			if(min > list[i].computeSalary())
				min = list[i].computeSalary();
		System.out.println("Min salary : "+min);
	}
	public static void main(String[] args) {
		ArrayOfEmployee a = new ArrayOfEmployee();
		a.input();
		a.output();
		a.count();
		a.minSalary();
	}

}
