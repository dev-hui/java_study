package control;

public class BreakTest {
	public static void main(String[] args) {
		// 1부터 정수를 더해나가서 누적합계가 
		// 100이 되는 순간 최종 더한 값을 찾기
		
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			if (sum >= 100) break;
			i++;
		}
		System.out.println("1부터 " + i + "까지 정수의 합계는 " + sum);
	}
}
