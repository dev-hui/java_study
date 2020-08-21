package july_15th;

public class BreakTest01 { // 1부터 정수를 더해나가서 누적 합계가 100이 되는 순간 최종 더한 값을 찾기
	public static void main(String[] args) {
		
		int sum = 0; 
		int i = 1;
		while(true) {
			sum += i;
			if (sum >= 100) break;  // sum이 100 이상이 되면 break -> 반복문 빠져나옴
			i++;
		}
		System.out.println("1부터 " + i + "까지 정수의 합계는 " + sum);
	}

}
