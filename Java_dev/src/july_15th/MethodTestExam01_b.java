package july_15th;

import java.util.Scanner;

public class MethodTestExam01_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		int result = (you - com + 3)%3;
		
		System.out.println("you : "+ caption(you));
		System.out.println("com : "+ caption(com));
		
		switch(result) {
		case 1 :
			System.out.println("you win!");
			break;
		case 2 :
			System.out.println("you lose!");
			break;
		case 0 :
			System.out.println("draw!");
			break;
			default : 
				System.out.println("error");
				break;
		}


}
