package file;
import java.util.*;
import java.io.*;

public class ReadFile2 {
	public static void read() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File//("D:\\LearnJava\\StudyingAtUniversity\\16_Homework01_TruongPhucHuy\\src\\file\\hours.txt"));
				("src/file/hours.txt"));
				while(in.hasNext())
		{
			System.out.println(in.nextLine());
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		read();
	}

}
