package july_16th_oop06;

public class SingleTest {
	public static void main(String[] args) {
		
	Single s1 = Single.getInstance();
	Single s2 = Single.getInstance();
	
	System.out.println(s1.hashCode());
	// hashcode 값이 다르면 각각은 서로 다른 인스턴스임을 나타냄
	System.out.println(s2.hashCode());
	// getInstance() 사용하면 hashcode 값이 서로 같음
	}
}
