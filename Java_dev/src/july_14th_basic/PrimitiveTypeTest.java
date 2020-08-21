package july_14th_basic;

public class PrimitiveTypeTest { // 기본 자료형 타입 확인
	public static void main(String[] args) {
		boolean b = true; // 참 거짓, 1byte
		System.out.println("b : " + b);
		
		char c = '신'; // 한 단어 담기 위한 것, 2byte
		System.out.println("c : " + c);
		
		byte b2 = 127; //2byte
		System.out.println("b2 : " + b2);
		
		int i = 128; // 플러스 마이너스 약 20억<<까지 쓸 수 있음, 4byte
		System.out.println("i : " + i);
		
		long l1 = 2147483648L; // 플러스 마이너스 900경, 8byte
		System.out.println("l1 : " + l1);
		
		short s = 32767; // 플러스 마이너스 2의 16승(약 3만)까지, 2byte
		System.out.println("s : " + s);
		
		double d = 3.141592; // 실수, 8byte
		System.out.println("d : " + d); 
		
		float f = 3.141592f; // 실수, 4byte, double에 비해 정밀도는 떨어짐 
		System.out.println("f : " + f);
	}

}
