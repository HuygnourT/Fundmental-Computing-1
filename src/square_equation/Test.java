package square_equation;

public class Test {

	public static void main(String[] args) {
		LinerEquation l = new LinerEquation();
		l.f(5,6); //5 + 6
		l.f(5,6,7);// 5 + 6 + 7
		l.f1(5, 6); // 5 * 6 ( of LE )
		SquareEquation s = new SquareEquation();
		s.f(5, 6); // 5 - 6
		s.f(5, 6, 7);// 5- 6 - 7
		s.f2(5, 6);// 5 + 6 ( of SE )
		LinerEquation ls = new SquareEquation();
		ls.f(5, 6); // 5 - 6
		ls.f(5, 6,7); // 5 - 6 - 7
		ls.f1(5, 6);// 5 * 6 ( of SE )
	}

}
