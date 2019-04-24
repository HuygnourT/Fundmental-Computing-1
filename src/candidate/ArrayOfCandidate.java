package candidate;

import java.util.*;
public class ArrayOfCandidate {
	private Candidate[] list = new Candidate[100];
	private int n;
	
	public void setN(int n)
	{
		this.n = n;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of list candidate : ");
		this.setN(in.nextInt());
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the information of candidate "+(i+1));
			Candidate tmp = new Candidate();
			tmp.input();
			list[i] = tmp;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("The information of candidate "+(i+1));
			list[i].output();
		}
	}
	public void passExam()
	{
		int dem = 0;
		for(int i = 0 ; i < n ; i++)
			if(!list[i].getAverageMark().equalsIgnoreCase("Fail"))
				dem++;
		System.out.println("There are "+dem+" candidates will pass this exam");
		
	}
	public void printAugustMonth()
	{
		System.out.println("The list of candidates born in August :");
		for(int i = 0 ; i < n ; i++)
			if(list[i].date.getMonth() == 8)
				System.out.println(list[i].getFullName());
	}
	public void delete(int index)
	{
		for(int i = index ; i < n-1 ; i++)
			list[i] = list[i+1];
		this.n--;
	}
	public void printNvlStreet()
	{
		System.out.println("The list of candidate live in Nguyen Van Linh Street");
		for(int i = 0 ; i < n ; i++)
			if(list[i].add.getStreet().equalsIgnoreCase("Nguyen Van Linh"))
				list[i].output();
	}
	public void printHaiChauDistrict()
	{
		System.out.println("The list of candidate live in Hai Chau District");
		for(int i = 0 ; i < n ; i++)
			if(list[i].add.getDistrict().equalsIgnoreCase("Hai Chau"))
				list[i].output();
	}
	public void sortAge()
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n-1 ;j++ )
				if(list[j].getCodeAge() > list[j+1].getCodeAge())
				{
					Candidate tmpc = list[j+1];
					list[j+1] = list[j];
					list[j] = tmpc;
				}
		}
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(list[i].getFullName());		
			list[i].date.getFullDay();
		}
	}
	public static void main(String[] args) {
		ArrayOfCandidate m = new ArrayOfCandidate();
		m.input();
		m.output();
		m.passExam();
		//m.printAugustMonth();
		m.printHaiChauDistrict();
		m.printNvlStreet();
		m.sortAge();
	}

}
