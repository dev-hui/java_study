package july_14th_basic;

public class OpTest07 {
	public static void main(String[] args) {
		int a = 10;
		a += 5; // a = a+5; equal은 반드시 오른쪽에 쓴다!!
		System.out.println(a); // 결과 15
		a -= 5; // a = a-5;
		System.out.println(a); // 결과 10
		a *= 5; // a = a*5;
		System.out.println(a); // 결과 50
		a /= 5; // a = a/5;
		System.out.println(a); // a(지금은 50)를 5로 나눈 몫 = 10
		a %= 5; // a = a%5;
		System.out.println(a); // a를 5로 나눈 나머지 = 0
		
		/* int a = 5;
		 * a++; // a = a+1
		 * a--; // a = a-1
		 */
	}
}
