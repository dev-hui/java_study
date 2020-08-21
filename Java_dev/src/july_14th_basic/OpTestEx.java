package july_14th_basic;

public class OpTestEx {
	public static void main(String[] args) {
		System.out.println((int)(Math.random() * 12) + 4);
		 // 4~15사이의 정수로 난수 발생
		System.out.println((int)(Math.random() * 18 + 6)*100);
		// 600 700 800 ... 2300 중 하나만 나오도록 난수 발생
	}

}
