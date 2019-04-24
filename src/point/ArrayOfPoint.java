package point;

import java.util.*;
public class ArrayOfPoint {
	private int n;
	private Point[] p = new Point[100];
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		this.n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the point "+(i+1)+" : ");
			Point f = new Point();
			f.input();
			p[i]=f;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("The point "+(i+1)+": "+p[i].toString());
		}
	}
	public void maxDistance()
	{
		int p1 = 0,p2 = 0;
		for(int i = 0 ; i < this.n-1 ; i++)
			for(int j = i+1 ; j < this.n ; j++)
				if(p[i].distance(p[j]) > p[p1].distance(p[p2]))
				{
					p1 = i;
					p2 = j;
				}
			
		System.out.println("The two point lengthest is : "+p[p1].toString()+" and "+p[p2].toString()
				+"\nThe length is "+p[p1].distance(p[p2]));
	}
	public void maxAreaTriangle()
	{
		//System.out.println(p[0].area(p[1],p[2]));
		//double maxArea = p[0].area(p[1], p[2]);
		int p1 = 0,p2 = 1,p3 = 2;
		for(int i = 0 ; i < n-2 ; i++)
			for(int j = i+1 ; j < n-1 ; j++)
				for(int k = j+1 ; k < n ; k++)
				{
					if(p[i].area(p[j], p[k]) > p[p1].area(p[p2], p[p3]))
					{
						p1 = i;
						p2 = j;
						p3 = k;
					}
				}
		if(p[p1].area(p[p2], p[p3]) == 0)
			System.out.println("No point make a triangle largest");
		else
		System.out.println("The 3 point make a triangle with the largest area is : "+p[p1].toString()+" ,"+p[p2].toString()+" ,"+p[p3].toString()
				+"\nThe area is "+p[p1].area(p[p2], p[p3]));
	}
	public static void main(String[] args) 
	{
		ArrayOfPoint arr = new ArrayOfPoint();
		arr.input();
		arr.output();
		arr.maxDistance();
		arr.maxAreaTriangle();
		System.out.println(arr.p[0].distance(arr.p[1]));
		System.out.println(arr.p[0].distance(arr.p[2]));
		System.out.println(arr.p[1].distance(arr.p[2]));
	}
}
