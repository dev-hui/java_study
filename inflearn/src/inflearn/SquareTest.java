package inflearn;

public class SquareTest {
	public static void main(String[] args) {
		Square s = new Square();
		s.length = 4;
		System.out.printf("한 변이 %d인 정사각형 넓이 : %d", s.length, s.area());
	}
}

class Square {
	int length;
	int area() {
		return length * length;
	}
}
