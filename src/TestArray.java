import java.util.Arrays;
import java.util.List;

public class TestArray {
	static int n =5,m=7;
	public static void main(String[] args) {
		
		Integer[] a1 = new Integer[]{4,15,8};
		Integer[] a2 = Arrays.copyOfRange(a1, 0,3);
		int[] a4 = {5,6,7};
		//a2[3] = 9;a2[4] = 7;
		char[] a3 = {'a','b','c','c'};
		List<Integer> list = Arrays.asList(a1);
		Arrays.fill(a3, 'm');
		System.out.println("a1 : "+Arrays.toString(a1));
		System.out.println("a2 : "+Arrays.toString(a2));
		System.out.println("a3 : "+Arrays.toString(a3));
		System.out.println("List : "+list);
		Arrays.sort(a1);
		System.out.println("a1 after sort : "+Arrays.toString(a1));
		
		
	}
	public static void swap(int n,int m)
	{
		int tmp = n;
		n = m;
		m = tmp;
	}

}
