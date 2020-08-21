package basic;

public class OpTest3 {
	public static void main(String[] args) {
		boolean a, b;
		a = true; b = true;
		System.out.println(a && b);
		System.out.println(a || b);

		a = true; b = false;
		System.out.println(a && b);
		System.out.println(a || b);

		a = false; b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
	}
}
