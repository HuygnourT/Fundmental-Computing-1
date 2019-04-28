package shape;

import java.util.*;

public class ArrayOfShape {
	private Shape[] list = new Shape[100];
	private int n;

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers of shape : ");
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the geometry " + (i + 1));
			System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
			int choose = in.nextInt();
			Shape tmp = new Shape();
			if (choose == 1)
				tmp = new Circle();
			else if (choose == 2)
				tmp = new Rectangle();
			else if (choose == 3)
				tmp = new Triangle();
			tmp.input();
			list[i] = tmp;
		}
	}

	public void output() {
		for (int i = 0; i < n; i++) {
			System.out.println("The geometry " + (i + 1));
			list[i].output();
		}
	}

	public static void main(String[] args) {
		ArrayOfShape a = new ArrayOfShape();
		a.input();
		a.output();
	}

}
