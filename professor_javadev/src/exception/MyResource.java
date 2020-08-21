package exception;

public class MyResource {
	public void use() {
		System.out.println("MyResource 사용 중...");
	}
	
	public void close() {
		System.out.println("MyResource 종료");
	}
}
