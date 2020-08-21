package july_15th;

public class ForTest5 { // 구구단 출력하기
	public static void main(String[] args) {
//		for (int k = 0; k < 6; k += 4) {  // 방법 1
//			for (int i = 1; i < 10; i++) {
//				for (int j = 2 + k; j < 6 + k; j++) {
//					System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		for (int i = 2; i <= 9; i += 4) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i+4; k++) {
					System.out.print(k + "*" + j + "=" + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
