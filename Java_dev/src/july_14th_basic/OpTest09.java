package july_14th_basic;

import java.util.Scanner;

public class OpTest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("남자면 1 또는 3, 여자면 2 또는 4 > "); int n = sc.nextInt();
		System.out.println(n == 1 || n == 3 ? "남자" : 
					       n == 2 || n == 4 ? "여자" :
					       "error");
	}

}
