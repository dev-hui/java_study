package exception;

public class MyResource2 implements AutoCloseable{
	public void use() {
		System.out.println("MyResource2 사용 중...");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("MyResource2 자원 해제...");
	}
}
