package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			throwExceptin();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

	private static void throwExceptin() throws Exception {
		
		System.out.println("throwException 수행중....");
		if (true) throw new RuntimeException();
		System.out.println("throwException 종료....");
	}
}
