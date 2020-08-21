package july_14th_control;

import java.util.Scanner;

public class IfTestExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number > ");
		int n = sc.nextInt();
		if (90 <= n && n <= 100) {  // 이렇게 말고 그냥 90 <= n 이렇게만 쳐도 됐음.
			System.out.println("A");
		} else if (80 <= n && n < 90) { // 그러면 여기는 80<= n 이렇게 치면 되는거구
			System.out.println("B");
		} else if (70 <= n && n < 80) {
			System.out.println("C");
		} else if (60 <= n && n < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
