package candidate;

import java.util.*;

public class ArrayOfPerson {
	private Person[] list = new Person[100];
	private int n;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the person "+(i+1));
			Person tmp = new Person();
			tmp.input();
			list[i] = tmp;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
		{
			//list[i].output();
			System.out.println(list[i].fullName()+" "+list[i].lastName());
		}
			
	}
	
	public void sort()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
				if(list[i].lastName().compareToIgnoreCase(list[i].lastName()) > 0)
				{
					Person tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
				else if(list[i].lastName().compareToIgnoreCase(list[i].lastName()) ==0 )
						if(list[i].fullName().compareToIgnoreCase(list[i].fullName()) > 0)
						{
							Person tmp = list[i];
							list[i] = list[j];
							list[j] = tmp;
						}
	}
	public void swap(int i,int j)
	{
		Person tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	}
	public static void main(String[] args) {
		ArrayOfPerson list = new ArrayOfPerson();
		list.input();
		list.output();
		list.sort();
		list.output();
	}

}
