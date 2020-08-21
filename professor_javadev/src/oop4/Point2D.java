package oop4;

public class Point2D {
	int x;
	int y;
	public Point2D() {
		this(1,1);
		System.out.println("Point2D() 생성자 수행");
	} // default constructor
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) 생성자 수행");
	}
	
	
}
