package candidate;

import java.util.*;
public class Date{
	int day,month,year;
	//constructor : ham khoi tao khong co doi so
	//gan gia tri ban dau cho att of class
	public Date()
	{
		setYear(1900);
		setMonth(1);
		setDay(1);
	}
	//constructor : ham khoi tao co doi so
	//truyen tham so ngoai vao cho att of class nhung phai kiem soat du lieu
	public Date(int d,int m,int y)
	{
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	public void setDay(int d)
	{
		if(d <= 0 || d > numberOfDays())
			day = 1;
		else
			day = d;
	}
	public void setMonth(int month)
	{
		if(month < 0 || month > 12)
			this.month = 1;
		else 
			this.month = month;
	}
	public void setYear(int year)
	{
		if(year > 5000 || year < 0)
			this.year = 1900;
		else 
			this.year = year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	public int numberOfDays()
	{
		switch(month)
		{
		case 4:case 6: case 9:case 11: return 30;
		case 2: if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) return 29;
				return 28;
		default: return 31;
		}
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: ");
		this.setYear(in.nextInt());
		System.out.println("Enter month: ");
		this.setMonth(in.nextInt());
		System.out.println("Enter day: ");
		this.setDay(in.nextInt());
	}
	public void output()
	{
		System.out.println("Birth day : " +this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
	public void getFullDay()
	{
		System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
	}
	public void nextDay()
	{
		if(getDay() == numberOfDays())
			if(getMonth() == 12)	System.out.println("1/1/"+(year+1));
			else System.out.println("1/"+(month+1)+"/"+year);
		else System.out.println((day+1)+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.getFullDay();
		//d1.nextDay();
		
		
	}

}
