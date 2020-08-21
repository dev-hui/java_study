package july_17th_exception;

public class MyResource2 implements AutoCloseable { // java 7 ~

	public void use() {
		System.out.println("MyResource is now Using...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("MyResource2 자원 해제...");
	}

}
