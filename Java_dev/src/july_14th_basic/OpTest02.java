package july_14th_basic;

import java.util.Scanner;

public class OpTest02 {
	public static void main(String[] args) { // 관계연산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a > "); int a = sc.nextInt();
		System.out.print("b > "); int b = sc.nextInt();
		
		System.out.println(a > b);  // 참거짓 판단 -> 결과 : true
		System.out.println(a >= b);
		System.out.println(a < b); 
		System.out.println(a <= b);
		System.out.println(a == b); 
		System.out.println(a != b);
		
	}
}
