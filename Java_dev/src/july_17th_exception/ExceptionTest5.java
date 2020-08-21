package july_17th_exception;

public class ExceptionTest5 {	// java 7 ~
	public static void main(String[] args) {
		try(MyResource2 myResource2 = new MyResource2()){	// try with resources
			myResource2.use();
		} catch (Exception e) {
			System.out.println("예외 : " + e.toString());
		}
	}

}
