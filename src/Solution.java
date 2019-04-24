
import java.util.*;

public class Solution {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int o = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
			int sa = a * x;
			int so = 0;
			int answer = 0;
			//System.out.println(sa);
			while(sa+a< z)
			{
				
				if( sa + a > so + o )
				{
					sa+=a;
					so+=o;
					//System.out.println(sa +" "+so+" "+answer);
				}
				else
				{
					sa = sa + a*y + a*so/o;
					so = 0;
					answer++;
					
					//System.out.println(sa +" "+so+" "+answer);
				}
			}
			System.out.println(answer);
		
	}
}
