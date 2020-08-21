package july_14th_control;

import java.util.Scanner;

public class IfTestExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number > ");
		int n = sc.nextInt();
		if (90 <= n) { System.out.println("A");} 
		else if (80 <= n) {System.out.println("B");} 
		else if (70 <= n) {System.out.println("C");} 
		else if (60 <= n) {System.out.println("D");} 
		else {System.out.println("F");}
	}

}
