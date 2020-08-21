package july_17th_exception;

public class ExceptionTest4 {	// ~java 6
	public static void main(String[] args) {
		MyResource myResource = null;
		try {
			myResource = new MyResource();
			myResource.use();
			// 보통 클래스 이름의 첫 글자를 소문자로 바꾼 것을 인스턴스 이름으로 많이 씀
		} catch (Exception e) {
			System.out.println("예외 : " + e.toString());
		} finally {
			if (myResource != null) try {myResource.close();} catch(Exception e) {}
		}
	}
}
