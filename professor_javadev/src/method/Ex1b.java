package method;

import java.util.Scanner;

public class Ex1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.print("you: ");
		caption(you);

		System.out.print("com: ");
		caption(com);

		if (you == 1 && com == 3 ||
			you == 2 && com == 1 ||
			you == 3 && com == 2) System.out.println("당신의 승리");
		else if (you == com) System.out.println("무승부입니다");
		else System.out.println("당신의 패배입니다.");
		
	}

	private static void caption(int val) {
		switch (val) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("error");
			break;
		}

	}
}