package july_17th_exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "WELCOME TO THE PARAISO";
		int[] i = {1, 2, 3};
		
		try {
			System.out.println(str.toString());
			System.out.println(i[3]);
		}	catch(NullPointerException | ArrayIndexOutOfBoundsException e) {  // java 7 
			System.out.println("NullPointerException, Array 예외 처리");
			e.printStackTrace();	// 아주 자세하게 예외 나온 위치 알려줌
			System.out.println("예외 : " + e.toString());  // 이게 예외야! 알려주는 거
			System.out.println("예외 메시지 : " + e.getMessage());	// 이것도 이게 예외라고 알려줌
		} catch (Exception e) {
			System.out.println("Exception 처리");
		} finally {
			System.out.println("예외의 발생 유무에 상관없이 출력되는 블럭입니다");
		}
		
		System.out.println("종료");
	}

}
