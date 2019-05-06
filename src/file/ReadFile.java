package file;
import java.io.*;
import java.util.*;
public class ReadFile {
	
	public static void main(String[] args) throws FileNotFoundException {
			File file = new File(
"D:\\LearnJava\\StudyingAtUniversity\\16_Homework01_TruongPhucHuy\\src\\file\\hours.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNext())
			{
				int id = sc.nextInt();
				String name = sc.next();
				int days = 0;
				double totalHours = 0;
				while(sc.hasNextDouble())
				{
					days++;
					totalHours = totalHours + sc.nextDouble();
				}
				System.out.println(name + " (ID#"+id+") worked "+totalHours+" hours ("
						+(totalHours/days)+" hours/day)");
			}
	}
}
