package control;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 7번째 숫자 입력 > ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: 
		case 3: System.out.println("남자");
			break;
		case 2: 
		case 4: System.out.println("여자");
			break;
		default:System.out.println("에러");
			break;
		}
		System.out.println("종료");		
	}
}
