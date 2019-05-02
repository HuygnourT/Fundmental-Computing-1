package p1;

public class A {
	public String pub = "Public";
	protected String pro = "Protected";
	String df = "Default";
	private String pri = "Private";
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.df);
		System.out.println(a.pri);
	}
}