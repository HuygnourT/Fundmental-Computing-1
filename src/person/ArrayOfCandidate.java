package person;

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
		System.out.println("There are "+dem+"candidates will pass this exam");
		
	}
	public void printAugustMonth()
	{
		System.out.println("The list of candidates born in August :");
		for(int i = 0 ; i < n ; i++)
			if(list[i].getMonth() == 8)
				System.out.println(list[i].getFullName());
	}
	public static void main(String[] args) {
		ArrayOfCandidate m = new ArrayOfCandidate();
		m.input();
		m.output();
//		m.passExam();
//		m.printAugustMonth();
		
		System.out.println(m.list[0].getDay()+"/"+m.list[0].getMonth()+"/"+m.list[0].getYear());
	}

}
