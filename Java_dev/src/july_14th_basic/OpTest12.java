package july_14th_basic;

public class OpTest12 {
	public static void main(String[] args) {
		double d = 10;  // 10 -> 10.0 자동 형변환, 묵시적 형변환
//		int i = 3.14; << !error! 실수 타입을 정수 타입으로 변환x
		int i = (int)3.14; // double 타입 형변환! 강제 형변환, 명시적 형변환
		
		System.out.println(d);
		System.out.println(i);
	}

}
