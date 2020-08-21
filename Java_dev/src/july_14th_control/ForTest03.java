package july_14th_control;

import java.util.Scanner;

public class ForTest03 {
	public static void main(String[] args) {
		char[] cho = { 		//초성 배열 만들기
				'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 
				'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ',
				'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 
				'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
		};

		Scanner sc = new Scanner(System.in);
		System.out.print("한글 단어 입력 > ");
		String in = sc.nextLine();
		String chosungString = "";
		for (int i = 0; i < in.length(); i++) {
			char thisChar = in.charAt(i);
			if ('가' <= in.charAt(i) && in.charAt(i) <= '힣') { // 공백 처리하기
				int ch = (in.charAt(i) - '가') / (28 * 21); // 단어의 초성 뽑아내기
				chosungString += cho[ch];
			} else {
				chosungString += thisChar;
			}
		}
		System.out.println(chosungString);
	}
}