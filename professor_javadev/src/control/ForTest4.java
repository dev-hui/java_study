package control;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		char[] cho = {
			'ㄱ','ㄲ','ㄴ','ㄷ','ㄸ',
			'ㄹ','ㅁ','ㅂ','ㅃ','ㅅ',
			'ㅆ','ㅇ','ㅈ','ㅉ','ㅊ',
			'ㅋ','ㅌ','ㅍ','ㅎ'
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 > ");
		String in = sc.nextLine();
		String chosungString = "";
		for(int i=0; i < in.length(); i++) {
			char thisChar = in.charAt(i);
			if ('가' <= thisChar && thisChar <= '힣') {
				int ch = (thisChar - '가')/(28*21);
				chosungString += cho[ch];
			} else {
				chosungString += thisChar;
			}
		}
		System.out.println(chosungString);
	}
}
