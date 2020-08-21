package july_15th_oop02;

public class Point2D {
	int x;
	int y;
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	public Point2D() {
		this(1,1);  // 생성자 오버로딩! 무조건 제일 먼저 나와야 함
		System.out.println("Point2D() 생성자 수행");
	}  
	
	// public Point2D(){}  <<디폴트 생성자. 이를 통해 인스턴스 생성할 수 있음. 전체적으로 생성자가 하나도 없을 경우에만 자동으로 생성
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) 생성자 수행");
	}
	


}
