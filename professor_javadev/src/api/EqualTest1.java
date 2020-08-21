package api;

public class EqualTest1 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		if (a == b) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println("----------------------------");
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("hi".toUpperCase());
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println("-----------------------------");
		
		String str3 = new String("how");
		String str4 = new String("how");
		if (str3 == str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str3.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		
		
		
	}
}
