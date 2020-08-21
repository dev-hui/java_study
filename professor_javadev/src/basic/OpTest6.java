package basic;

public class OpTest6 {
	public static void main(String[] args) {
		int a = 10;
		int t = a++;	// t = a
						// a = a + 1
		System.out.println(a + "," + t);
	}
}
