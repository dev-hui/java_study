package july_14th_basic;

import java.util.Scanner;

public class OpTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀짝 판별, 숫자 입력 >"); int n = sc.nextInt();
		
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		// 주의!!! 나머지 연산의 부호가 -가 되는 경우가 있음
	}
}
