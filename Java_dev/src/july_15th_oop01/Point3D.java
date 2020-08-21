package july_15th_oop01;

public class Point3D extends Point2D {
	 private int Z;

	public int getZ() {
		return Z;
	}

	public void setZ(int z) {
		Z = z;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("z = " + getZ());
	}

}
