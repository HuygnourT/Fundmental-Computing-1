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
			{
				Employee tmp = new Regular();
				tmp.input();
				list[i] = tmp;
			}
			else if (choose == 2)
			{
				Employee tmp = new Contract();
				tmp.input();
				list[i] = tmp;
			}
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
	public static void main(String[] args) {
		ArrayOfEmployee a = new ArrayOfEmployee();
		a.input();
		a.output();
	}

}
