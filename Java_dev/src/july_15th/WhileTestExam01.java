package july_15th;

public class WhileTestExam01 { // 1~1000까지 3의 배수 더하기
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i <= 1000) {
			sum += i;
			i += 3;
		}
		System.out.println(sum);
		System.out.println("is it correct?");
		System.out.println("i think yes");
	}

}
