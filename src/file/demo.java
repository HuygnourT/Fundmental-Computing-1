package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class demo {
	public static void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream("src/file/demo.asd");
		p.append("a b c d e f g h i j k l");
		p.append("\n1 3 5 7 9");
		p.append("\n2 4 6 8");
		
	}
	public static void read() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("src/file/demo.asd"));
		int sumOdd=0,sumEven=0;
		while(in.hasNext())
		{
			 if(in.hasNextInt())
			{
				int tmp = in.nextInt();
				if(tmp % 2 ==0)
					sumEven +=tmp;
				else sumOdd +=tmp;
			}
			 else System.out.println(in.next());
		}
		System.out.println("Sum Even : "+sumEven+"\nSum Odd : "+sumOdd);
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		write();
		read();
	}

}
