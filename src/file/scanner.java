package file;
import java.util.*;
public class scanner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter s : ");
		String s = in.nextLine();
		
		int index = s.lastIndexOf(" ");
		String lastName = s.substring(index+1);
		String fullName = s.substring(0,index);
		System.out.println(lastName+" "+fullName);
//		in = new Scanner(s);
//		String sNew = "";
//		while(in.hasNext())
//		{
//			sNew = in.next() +" " + sNew;
//		}
			
//		System.out.println(sNew);
//		in = new Scanner(s);
//		System.out.println(s);
//		int sInt=0;
//		double sDouble=0;
//		while(in.hasNext())
//			if(in.hasNextInt())
//				sInt = in.nextInt();
//			else if(in.hasNextDouble())
//				sDouble = in.nextDouble();
//			else in.next();
//		System.out.println("Sum of Integer Number: "+sInt+"\nSum of Real Number: "+sDouble);
	}
}
