package oop7;

public class PointTest {
	public static void main(String[] args) {
		
		// 클래스 사이의 형변환
		Point2D pt = new Point3D();	// up casting : 서브타입 인스턴스를 수퍼타입의 변수로 접근 -> 자동형변환
		pt.x = 100;					
		pt.y = 200;
		//pt.z = 300;				// 반드시 수퍼타입에 선언된 필드 혹은 메서드(오버라이딩)만 접근 가능
		
		Point3D pt2= (Point3D) pt;	// down casting : 서브타입 인스턴스를 참조하는 수퍼타입 변수를 재 참조 -> 강제형변환
		pt2.x = 10;					// 다운캐스팅한 타입에서 선언된 모든 필드와 메서드에 접근 가능
		pt2.y = 20;
		pt2.z = 30;
		
	}
}
