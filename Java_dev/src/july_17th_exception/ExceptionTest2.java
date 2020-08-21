package july_17th_exception;

public class ExceptionTest2 {
	public static void main(String[] args) {	
		
	try {
		throwExceptin();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("the END");
	}
	
	private static void throwExceptin() throws Exception {	// throws 예외 처리를 나를 호출한 쪽으로 미루는 것
		
		System.out.println("throwException 수행중....");
		if (true) throw new RuntimeException();		// 예외처리가 안 된 경우, 예외가 발생한 줄부터 밑은 출력 안됨
		
		System.out.println("throwException 종료....");
		
	}
}
