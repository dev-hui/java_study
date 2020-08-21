package method;

public class MethodTest3 {
	public static void main(String[] args) {
		int n = dice();
		System.out.println(n);
	}

	private static int dice() {
		return (int)(Math.random() * 6)+1;
	}
}
