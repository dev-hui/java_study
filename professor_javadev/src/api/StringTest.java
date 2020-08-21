package api;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "실수란 신을 용서하는 인간의 행위이다";
		System.out.println(str1.replace("인간", "사람"));
		System.out.println(str1);
		
		System.out.println(str1=str1.replace("인간", "사람"));
		System.out.println(str1);
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(5));
		System.out.println(str1.substring(12));
		System.out.println(str1.substring(12,14));
		System.out.println(str1.indexOf('신'));
		System.out.println(str1.indexOf('준'));
		System.out.println(str1.lastIndexOf('사'));
		System.out.println(str1.indexOf('사'));
	}
}
