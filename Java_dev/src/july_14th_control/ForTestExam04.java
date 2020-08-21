package july_14th_control;

public class ForTestExam04 {
	public static void main(String[] args) {
		for (char c = '가', i = 1; c <= '힣'; c += (28 * 21), i++) {
			System.out.print(c);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
