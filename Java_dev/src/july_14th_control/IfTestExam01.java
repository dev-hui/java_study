package july_14th_control;

import java.util.Scanner;

public class IfTestExam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number > "); int n = sc.nextInt();
		if (n == 1 || n == 3) {
			System.out.println("boy");
		} else if (n == 2 || n == 4) {
			System.out.println("girl");
		} else {
			System.out.println("error");
		}
	}

}
