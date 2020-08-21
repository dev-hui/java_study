package control;

public class Ex1 {
	public static void main(String[] args) {
		int n = 6;
		
		if (n == 1 || n == 3) {
			System.out.println("남자");
		} else if (n == 2 || n == 4){
			System.out.println("여자");
		} else {
			System.out.println("에러");
		}
		System.out.println("종료");
	}
}
