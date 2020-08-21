package exception;

public class ExceptionTest4 {	// ~java 6
	public static void main(String[] args) {
		MyResource myResource = null;
		try {
			myResource = new MyResource();
			myResource.use();
		} catch (Exception e) {
			System.out.println("예외 : " + e.toString());
		} finally {
			if (myResource != null) try {myResource.close();}catch(Exception e) {}
		}
	}
}
