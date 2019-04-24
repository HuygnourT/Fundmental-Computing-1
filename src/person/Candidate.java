package person;

import java.util.*;

public class Candidate extends Person
{
	private String codeID;
	private double testMark1,testMark2,testMark;
	private String averageMark;
	public void setCodeID(String codeID)
	{
		this.codeID = codeID;
	}
	public void setTestMark1(double testMark1)
	{
		this.testMark1 = testMark1;
	}
	public double getTestMark1()
	{
		return this.testMark1;
	}
	public void setTestMark2(double testMark2)
	{
		this.testMark2 = testMark2;
	}
	public double getTestMark2()
	{
		return this.testMark2;
	}
	public void setTestMark(double testMark)
	{
		this.testMark = testMark;
	}
	public double getTestMark()
	{
		return this.testMark;
	}
	public void getCodeID()
	{
		System.out.println(this.codeID);
	}
	public void setAverageMark()
	{
		double point =( ( testMark1 + testMark2 ) / 2.0 + testMark*2.0 )/ 3;
		if(point >=8) this.averageMark = "Good";
		else if(point >= 7 ) this.averageMark = "Fairly Good";
		else if(point >= 5 ) this.averageMark = "Average";
		else this.averageMark = "Fail";
	}
	public String getAverageMark()
	{
		return this.averageMark;
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the code id of candidate : ");
		this.setCodeID(in.nextLine());
		System.out.println("Enter the name of candidate : ");
		super.setFullName(in.nextLine());
		super.date.input();
		System.out.println("Enter the point of test mark 1 : ");
		this.setTestMark1(in.nextDouble());
		System.out.println("Enter the point of test mark 2 : ");
		this.setTestMark2(in.nextDouble());
		System.out.println("Enter the point of test mark : ");
		this.setTestMark(in.nextDouble());
		this.setAverageMark();
	}
	public void output()
	{
		this.getCodeID();
		super.output();
		System.out.println("The average mark is : "+this.getAverageMark());
	}
	public static void main(String[] args) 
	{
		Candidate m1 = new Candidate();
		m1.input();
		m1.output();
	}

}
