package method;

public class MethodTest1 {
	public static void main(String[] args) {
		print();
		print("경훈");
		print("수민");	// method overloading
	}

	private static void print(String name) {
		System.out.println("----------");
		System.out.println("헬로, " + name);
		System.out.println("----------");
	}

	private static void print() {
		System.out.println("----------");
		System.out.println("헬로, 지민");
		System.out.println("----------");
	}
}
