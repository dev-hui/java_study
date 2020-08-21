package july_14th_control;

public class ForTestExam02 { // 1부터 1000까지 3의 배수의 합계를 출력
	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 1 ; i <= 1000 ; i++)    << 방법 1
//			if (i%3 == 0) {
//				sum += i;
//			}
//		}
		for (int i = 3 ; i <= 1000 ; i+=3) {  // << 방법 2
			sum += i;
		}
		System.out.println(sum);
		System.out.println("잘 되었으려나?");
		System.out.println("Profit!");
	}
}
