package date;

public class Date 
{
	private int month,year;
	
	public Integer numberOfDays()
	{
		switch(month)
		{
		case 1:case 3:case 5:case 7:case 9:case 11: return 31;
		case 4:case 6:case 8: case 10:case 12: return 30;
		case 2: if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) return 29;
				return 28;
		default: return null;
		}
		
	}
	public static void main(String[] args)
	{
		Date date = new Date();
		date.month = 2;
		date.year = 2016;
		System.out.println("Numbers Of Day Is "+date.numberOfDays());
	}
}
