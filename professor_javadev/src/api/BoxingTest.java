package api;

public class BoxingTest {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = i;		// auto boxing (jdk1.5~)
		Integer i3 = Integer.valueOf(i);
		
		i = i2;				// auto unboxing (jdk1.5~)
	}
}
