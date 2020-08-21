package july_15th;

public class MethodTest01 {
	public static void main(String[] args) {
		print();  // parameter 존재x
		print("MAYOIGA");
		print("ENISHI");
		print("RANBU");
		print("ARAGAU");  // method overloading, parameter 존재하는 경우
	}

	private static void print(String name) { // return값 존재x
		
		System.out.println("---------------------");
		System.out.println(" Welcome to the "+name);
		System.out.println("---------------------");
	}
	
	private static void print() {
		
		System.out.println("---------------------");
		System.out.println(" Welcome to the MERA");
		System.out.println("---------------------");
//		return;  << 생략 가능
	}
}
