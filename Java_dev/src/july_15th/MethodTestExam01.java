package july_15th;

import java.util.Scanner;

public class MethodTestExam01 {
	public static void main(String[] args) {
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		System.out.println("당신의 " + result()+"입니다!");
	}

	private static String result() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int you = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		String r = " ";
		System.out.println("\nyou : " + you + "\n" + "com : " + com + "\n" );
		if(you == 1) {
			
			if(com == 1) {return "무승부";}
			else if(com == 2) {return "패배";}
			else {return "승리";}} 
		else if (you == 2) {
				if (com == 1) { return "승리";}
				else if (com == 2) {return "무승부";}
				else {return "패배";}} 
		else if (you == 3 ) {
				if (com == 1) {return "패배";}
				else if (com == 2) {return "승리";}
				else {return "무승부";}}
		else return "error!!";

		}
	}



