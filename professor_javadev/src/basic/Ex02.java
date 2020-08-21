package basic;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 조건연산 (== 3항연산)
		Scanner sc = new Scanner(System.in);
		System.out.print("양수음수판별, 숫자 입력 > ");int n = sc.nextInt();

		System.out.println( n > 0 ? "양수" : 
							n < 0 ? "음수" : "양수도 음수도 아님");
	}
}
