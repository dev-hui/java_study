package july_16th_oop06;

public class Single {
	// Singleton : 인스턴스를 오직 하나만 만들기!

	private static Single single = null;
	// 1. 생성자를 private로
	// 2. 자기 자신을 참조하기 위한 공유변수 선언
	
	public static Single getInstance() {
		if (single == null) {
			single = new Single();
		}
		return single;
	}
	// 3. 최초 한번만 인스턴스 생성하고 그것을 공유해서 리턴하는
	// getInstance() 메소드 작성
	// 4. 사용 : Single.getInstance();
	private Single() {}
}
