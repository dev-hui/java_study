package july_15th;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		int c1, c2, c3; // 컴퓨터가 생성한 변수
		int h1, h2, h3; // 사람이 생성한 변수
		int s, b; // 스트라이크, 볼
		int count = 0; // 몇 번 만에 맞추었나 세는 것
		Scanner sc = new Scanner(System.in);
		
		c1 = (int)(Math.random() * 10);  // 0~9
		do {
     		c2 = (int)(Math.random() * 10);  // 0~9
		} while(c1 == c2);  // if c1=c2, then do it again
		do {
	    	c3 = (int)(Math.random() * 10);  // 0~9
		} while(c3 == c1 || c3 == c2);  // if c3=c1 or c3=c2, do it again
		do {
			s = b = 0; //초기화
			System.out.print("0부터 9까지 중복되지 않은 숫자 3개 입력(숫자와 숫자 사이는 공백) > ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
		    
			if (h1 == c1) s++;
			else if (h1 == c2 || h1 == c3) b++;
			
			if (h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			
			if (h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.println("[" + s + "S " + b + "B]");  // 스트라이크, 볼의 개수 출력
			
			count ++;
		} while(s!=3);  // 3스트라이크가 아니면 다시 돌아가기
		System.out.println("Congraturation!! " + count + "번 만에 성공하셨습니다");
		}
	}


