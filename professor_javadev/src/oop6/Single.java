package oop6;

public class Single {
	private static Single single = null;
	private Single() {}
	
	public static Single getInstance() {
		if (single == null) {
			single = new Single();
		}
		return single;
	}
	//	singleton
	// 1. 생성자를 private으로
	// 2. 자기 자신을 참조하기 위한 공유변수 선언
	// 3. 최초 1번만 인스턴스를 생성하고 그것을 공유해서 리턴하는
	//    getInstance() 메소드 작성
	// 4. 사용 : Single.getInstance();
	
}
