package basic;
/*
 * multi line comment 
 * 
 */
public class Hello2 {
	public static void main(String[] args) {
		// escape sequence
		System.out.println("안녕하세요\t안녕하세요");
		System.out.println("안녕하세요\n안녕하세요");
		System.out.println("안녕하세요\\안녕하세요");
		
		System.out.println("갈릴레오 왈 \"그래도 지구는 돈다\"");
		System.out.printf("hello %d %x %s\n", 10, 10, "java");
		System.out.printf("%d\n", (int)'A');
		System.out.printf("%x\n", (int)'가');
	}
}
