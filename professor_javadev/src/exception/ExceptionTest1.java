package exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "뷁";
		int[] i = {1,2,3};
		
		try {
			System.out.println(str.toString());	// throw new NullPointerException();
			System.out.println(i[3]);
		} catch(NullPointerException | ArrayIndexOutOfBoundsException e) {  // java 7
			System.out.println("NullPointerException, Array예외 처리");
			e.printStackTrace();
			System.out.println("예외 : " + e.toString());
			System.out.println("예외메시지 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception 처리");
		} finally {
			System.out.println("예외의 발생 유무에 상관없이 수행되는 블럭");
		}
		
		System.out.println("종료");
	}
}
