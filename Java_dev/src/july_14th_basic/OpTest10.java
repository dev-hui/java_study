package july_14th_basic;

import java.util.Scanner;

public class OpTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number "); int n = sc.nextInt();
		
		System.out.println(n > 0 ? "양수" :
						   n < 0 ? "음수" :
						   "error");
	}

}
