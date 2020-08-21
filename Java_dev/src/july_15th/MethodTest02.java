package july_15th;

public class MethodTest02 {
	public static void main(String[] args) {
		int a = 5, b = 3;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println(a + "-" + b + "=" + sub(a, b));
		System.out.println(a + "*" + b + "=" + mul(a, b));
		System.out.println(a + "/" + b + "=" + div(a, b) + "..." + mod(a, b));
	}


	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
	private static int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	private static int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}

}
