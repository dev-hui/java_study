package july_14th_control;

public class ForTestExam01 {
	public static void main(String[] args) {
		for (int i = 10 ; i <= 30 ; i = i + 10 ) { // or (i = 1 ; i <= 3 ; i++)
			System.out.printf("%d : Hello\n", i); // (i * 10 + ": Hello"); 이렇게 할 수도 있음
		}
		System.out.println("the End");
	}

}
