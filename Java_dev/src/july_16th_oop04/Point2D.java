package july_16th_oop04;

public class Point2D {
	int x;
	int y;
	public Point2D() {
		this(1,1);
		System.out.println("Point2D() 생성자 수행");
	} // 1. public Point2D(){}  << 디폴트 생성자. 다른 생성자가 없을 경우 (눈에는 안보이지만) 이런 거 만들어 줌! 
	  // 3. 따라서 디폴트 생성자를 별개로 만들어 주어야 error가 나지 않게 된다.

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	public Point2D(int x, int y) {   // 2. 새로운 생성자 만든 것. 이 경우 디폴트 생성자가 사라짐 -> 잘 되던 기존 코드에 error
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 생성자 수행");
	}

}
