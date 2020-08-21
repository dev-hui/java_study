package july_15th;

public class MethodTest04 { // 메소드 오버로딩
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
	}

	private static void print(int... i) { // 이 '...'쓰면 가변형 파라미터 처리가 됨! 배열 개수에 따라서 알아서 받아줌
//		for (int j = 0; j < i.length; j++) {
//			System.out.print(i[j] + "\t");
//		}
		for(int j : i) {  // enhanced for문
			System.out.print(i[j] + "\t");
		}
		System.out.println();
	}

}
