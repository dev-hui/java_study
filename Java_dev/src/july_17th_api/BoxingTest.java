package july_17th_api;

public class BoxingTest {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = i;		// auto boxing(jdk1.5 ~)
		Integer i3 = Integer.valueOf(i);  // 위의 auto boxing이 되기 전까지는 이런 식으로 써야 했음

		i = i2;  		   // 이렇게 쓸 수도 있음 << auto unboxing(jdk1.5 ~)
	}
}
