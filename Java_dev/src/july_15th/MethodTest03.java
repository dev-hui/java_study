package july_15th;

public class MethodTest03 {
	public static void main(String[] args) {
		int n = dice();
		System.out.println(n);
	}

	private static int dice() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*6)+1;
	}

}
