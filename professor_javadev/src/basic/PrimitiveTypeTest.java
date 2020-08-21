package basic;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("b : " + b);
		
		char 뷁 = '가';
		System.out.println("뷁 : " + 뷁);
		
		byte b2 = 127;
		System.out.println("b2 : " + b2);
		
		int i = 2147483647;		// 4byte(±20억)
		System.out.println("i : " + i);
		
		long l1 = 2147483648L;	// 8byte(±900경)
		System.out.println("l1 : " + l1);
		
		short s = 32767;		// ±3만
		System.out.println("s : " + s);
		
		double d = 3.1415926535;// 8byte	
		System.out.println("d : " + d);
		
		float f = 3.1415926535f;// 4byte
		System.out.println("f : " + f);
	}
}
