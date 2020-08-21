package july_16th_oop04;

public class Point3D extends Point2D {
	int z;
	
	public Point3D() {
		this(2, 3, 4);
		System.out.println("Point3D() 생성자 수행");
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x, y, z)");
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}


	
	
}
