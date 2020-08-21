package basic;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 조건연산 (== 3항연산)
		Scanner sc = new Scanner(System.in);
		System.out.print("남자면1또는 3, 여자면 2또는4 > ");int n = sc.nextInt();

		System.out.println(n == 1 || n == 3 ? "남자" : 
			               n == 2 || n == 4 ? "여자" :
									          "에러");
	}
}
