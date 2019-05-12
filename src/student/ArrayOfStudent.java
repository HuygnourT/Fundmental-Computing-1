package student;
import java.util.Scanner;
public class ArrayOfStudent {
	private Student[] list = new Student[100];
	private int n;
	public void input()
	{
		System.out.println("Enter n: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter student "+(i+1));
			System.out.println("1.StudentA\n2.StudentB");
			int choose = in.nextInt();
			if(choose == 1)
			{
				list[i] = new StudentA();
				list[i].input();
			}
			else if(choose == 2)
			{
				list[i] = new StudentB();
				list[i].input();
			}
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Student "+(i+1));
			list[i].output();
		}
	}
	public void declineName()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
			{
				int index1 = list[j].name().lastIndexOf(" ");
				int index2 = list[j+1].name().lastIndexOf(" ");
				String first1 = list[j].name().substring(index1+1);
				String first2 = list[j+1].name().substring(index2+1);
				String full1 = list[j].name().substring(0,index1);
				String full2 = list[j+1].name().substring(0,index2);
				if(first1.charAt(0) > first1.charAt(0))
				{
					Student tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
				else if(first1.charAt(0) == first2.charAt(0))
				{
					if(first1.compareTo(first2) > 0)
					{
						Student tmp = list[j];
						list[j] = list[j+1];
						list[j+1] = tmp;
					}
				}
				else if(full1.compareTo(full2) > 0 )
				{
					Student tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
				
	}
	public static void main(String[] args) {
		ArrayOfStudent list = new ArrayOfStudent();
		list.input();
		list.output();
		list.declineName();
		list.output();
	}
}
