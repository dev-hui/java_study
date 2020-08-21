package july_15th;

public class ContinueTest01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i%3 != 0)  // i를 3으로 나눈 나머지가 0이 아님 -> 3의 배수가 아님
				continue;  // 밑으로 내려가지 말고 다시 위로 올라가기
			sum += i;
		}
		System.out.println(sum);
	}
}