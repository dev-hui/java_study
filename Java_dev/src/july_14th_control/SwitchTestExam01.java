package july_14th_control;

import java.util.Scanner;

public class SwitchTestExam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 7번째 숫자 입력 > ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
		case 3:	System.out.println("boy");
			break;
		case 2:
		case 4: System.out.println("girl");
			break;
		default: System.out.println("error");
		}
		System.out.println("the end! thank you");
	}

}
