package july_17th_api;

public class EqualTest1 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		if (a == b) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		System.out.println("---------------------------------");
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("paraiso".toUpperCase());
		if (str1 == str2) {
			System.out.println("it's same");
		} else {
			System.out.println("they are different");
		}
		
		System.out.println("---------------------------------");
		
		String str3 = new String("how");
		String str4 = new String("how");
		
		if (str3 == str4) {	// 서로 다르다고 나옴
			System.out.println("it's same");
		} else {
			System.out.println("they are different");
		}
		
		if (str3.equals(str4)) {	// 이렇게 하면 서로 같다고 나옴
			System.out.println("it's same");
		} else {
			System.out.println("they are different");
		}		
			
	}

}
