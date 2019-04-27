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
			Employee tmp = new Employee();
			if(choose == 1)
				tmp = new Regular();
			else if (choose == 2)
				tmp = new Contract();
			tmp.input();
			list[i] = tmp;
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
	public static void main(String[] args) {
		ArrayOfEmployee a = new ArrayOfEmployee();
		a.input();
		a.output();
		a.count();
	}

}
