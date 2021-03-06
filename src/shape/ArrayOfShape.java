package shape;

import java.util.*;
import java.io.*;
public class ArrayOfShape {
	private Shape[] list = new Shape[100];
	private int n;
	public void readFile() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("src/shape/input.txt"));
		while(in.hasNextLine())
		{
			String str = in.next();
			if(str.compareTo("rectangle") == 0)
			{
				Shape s = new Rectangle(in.nextDouble(),in.nextDouble());
				list[n] = s;
				n++;
			}
			else if(str.compareTo("circle") == 0)
			{
				Shape s = new Circle(in.nextDouble());
				list[n] = s;
				n++;
			}
			else if(str.compareTo("triangle") == 0)
			{
				Shape s = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble());
				list[n] = s;
				n++;
			}
			else if(str.compareTo("square") == 0)
			{
				Shape s = new Square(in.nextDouble());
				list[n] = s;
				n++;
			}
			else if(str.compareTo("cylinder") == 0)
			{
				Shape s = new Cylinder(in.nextDouble(),in.nextDouble());
				list[n] = s;
				n++;
			}
		}
	}
	public void sortArea()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
			{
				if(list[i].area() > list[j].area())
				{
					Shape tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
	}
	public void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream(new File("src/shape/output.txt"));
		for(int i = 0 ; i < n ; i++)
		{
			if(list[i] instanceof Triangle)
			{
				p.append("The area of triangle : "+list[i].area()+"\n");
			}
			else if(list[i] instanceof Square)
			{
				p.append("The area of square : "+list[i].area()+"\n");
			}
			else if(list[i] instanceof Cylinder)
			{
				p.append("The area of cylinder : "+list[i].area()+"\n");
			}
			else if(list[i] instanceof Circle)
			{
				p.append("The area of circle : "+list[i].area()+"\n");
			}
			else if(list[i] instanceof Square)
			{
				p.append("The area of Square : "+list[i].area()+"\n");
			}
			else if(list[i] instanceof Rectangle)
			{
				p.append("The area of rectangle : "+list[i].area()+"\n");
			}
		}
			
	}
	public void insert() throws IOException
	{
		String tmp = "\n\n\n";
		File p = new File("src/shape/input.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		for(int i = 0 ; i < n ; i++)
			tmp = tmp.concat("The area of the geometry "+(i+1)+" is "+list[i].area()+"\n");
		fw = new FileWriter(p.getAbsoluteFile(),true);
		bw = new BufferedWriter(fw);
		bw.write(tmp);
		try {
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers of shape : ");
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the geometry " + (i + 1));
			System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Square\n5.Cylinder");
			int choose = in.nextInt();
			if (choose == 1)
				list[i] = new Circle();
			else if (choose == 2)
				list[i] = new Rectangle();
			else if (choose == 3)
				list[i] = new Triangle();
			else if(choose == 4)
				list[i] = new Square();
			else if(choose == 5)
				list[i] = new Cylinder();
			list[i].input();
		}
	}
	public void output() {
		for (int i = 0; i < n; i++) {
			System.out.println("The geometry " + (i + 1));
			list[i].output();
		}
	}
	public static void main(String[] args) throws FileNotFoundException,IOException {
		ArrayOfShape a = new ArrayOfShape();
		//a.input();
		a.readFile();
		a.output();
		a.sortArea();
		a.write();
		
	}

}
