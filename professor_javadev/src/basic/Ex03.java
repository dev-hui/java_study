package basic;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 조건연산 (== 3항연산)
		Scanner sc = new Scanner(System.in);
		System.out.print("홀짝 판별, 숫자 입력 > ");
		int n = sc.nextInt();

		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		// 주의!!! 나머지 연산의 부호가 -가 되는 경우
	}
}
