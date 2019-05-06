
public class TestString {
	public static void main(String[] args) 
	{
//		String s = (new StringBuilder().append("  Sachin").append(" Tendulkar").toString());
//		String s1 = "  Sachin Tendulkar";
//		String s2 = s.intern();
//		String s3 = new String();
//		System.out.println(s);
//		System.out.println(s1.trim());
//		System.out.println("s1 == s "+(s1 == s));
//		System.out.println("s1 == s2 "+(s1 == s2));
//		System.out.println(s3.codePointAt(0));
		String s1 ="Duy Tan";
		String s2 = new String("Duy Tan");
		char[] s = {'D','u','y',' ','T','a','n'};
		String s3 = new String(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
	}
}
