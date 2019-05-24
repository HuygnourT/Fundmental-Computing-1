package file;
import java.io.*;
import java.util.*;
public class ReadFile {
	
	public static void main(String[] args) throws FileNotFoundException {
			File file = new File(
"src/file/huy.txt");
			Scanner sc = new Scanner(new File("src/file/huy"));
			Person[] tmp = new Person[3];
			int i = 0;
			while(sc.hasNextLine())
			{
				tmp[i] = new Person();
				sc.nextLine();
				tmp[i].setName(sc.nextLine());
				tmp[i].setGender(sc.nextLine());
				//Sring tmp2 = sc.nextLine();
				//System.out.println(sc.nextLine());
				//String tmp3 = sc.nextLine();
				//System.out.println(sc.nextLine());
				i++;
			}
			for(int j = 0 ; j < i ; j++)
				System.out.println(tmp[j].getName()+" "+tmp[j].getGender());
			//System.out.println(tmp[0].getName()+" "+tmp[0].getGender());
	}
}
