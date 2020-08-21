package july_17th_api;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "복잡한 세상 편하게 살자";
		System.out.println(str1.replace("세상", "인생"));	// 원본이 바뀌는 것은 아님
		System.out.println(str1);
		System.out.println(str1 = str1.replace("세상", "인생"));	// 원본도 바뀜
		System.out.println(str1);
		System.out.println(str1 = str1.replace("인생", "세상"));	// 원본도 바뀜
		System.out.println(str1);
		
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(5));
		System.out.println(str1.substring(7));		// 7번째 인덱스부터 끝까지 출력
		System.out.println(str1.substring(7, 10));  // 9번째 인덱스까지 출력하고 싶으면 +1 해줘야함
		System.out.println(str1.indexOf('세'));	 	// 위치 출력
		System.out.println(str1.indexOf('안'));	 	// 문장 내에 없는 글자 -> -1로 출력
	}
}
