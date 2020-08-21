package july_15th_oop01;

public class Point2D {
	private int x; // property, field...  / information hiding
	private int y;
	public int getX() {  // behavior(행위)
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x = " + this.getX());
		System.out.println("y = " + getY());

	}
}
