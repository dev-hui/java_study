package oop8;

public class AnimalTest {
	public static void main(String[] args) {
//		Bird b = new Bird();
//		System.out.println(b);
//		
//		Animal a = b;
//		System.out.println(a);
//		
//		Bird b2 = (Bird) a;
//		System.out.println(b2);
//		
//		if (b2 instanceof Eagle) {
//			Eagle e = (Eagle) b2;
//			System.out.println(e);
//		} else {
//			System.out.println("다운캐스팅 불가ㅜㅜ");
//		}
		
//		Eagle e = new Eagle();
//		Animal a2 = e;
//		System.out.println(a2);
//		Bird b3 = (Bird)a2;
//		System.out.println(b3);
//		Eagle e2= (Eagle) b3;
//		System.out.println(e2);
		
		Cat c1 = new Cat();
		Animal a3 = c1;
		System.out.println(a3);
		
		if (a3 instanceof Bird) {
			Bird b4 = (Bird) a3;
			System.out.println(b4);
		} else {
			System.out.println("Cat은 Bird가 아니야~");
		}
	}
}
