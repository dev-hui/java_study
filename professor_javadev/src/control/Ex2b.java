package control;

import java.util.Scanner;

public class Ex2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100사이의 점수 입력 > ");
		int score = sc.nextInt();
		
		if      (90 <= score && score <= 100)System.out.println("A");
		else if (80 <= score && score <= 89) System.out.println("B");
		else if (90 <= score && score <= 79) System.out.println("C");
		else if (60 <= score && score <= 69) System.out.println("D");
		else if (0  <= score && score <= 59) System.out.println("F");
		
	}
}
