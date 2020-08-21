package july_16th_oop08;

public class AnimalTest {
	public static void main(String[] args) {
//		Bird b = new Bird();
//		System.out.println(b);
//		
//		Animal a = b;	// up casting
//		System.out.println(a);
//		
//		Bird b2 = (Bird) a; 	// down casting << 강제 형변환
//		System.out.println(b2);
//		
//		if (b2 instanceof Eagle) { 	// instanceof 사용해서 캐스팅이 가능한가의 여부 확인해 볼 수 있음
//			Eagle e = (Eagle) b2;	// 모든 Bird가 Eagle인 것은 아니기에 error
//			System.out.println(e);
//		} else {
//			System.out.println("다운 캐스팅 불가");
//		}
		
//		Eagle e = new Eagle();
//		Animal a2 = e;	// up casting
//		System.out.println(a2);
		
//		Bird b3 = (Bird)a2;     // down casting << 가능
//		System.out.println(b3);
		
//		Eagle e2 = (Eagle)b3;  // down casting << 가능
//		System.out.println(e2);
		
		Cat c1 = new Cat();
		Animal a3 = c1;
		System.out.println(a3);

		if (a3 instanceof Bird) {
			Bird b4 = (Bird) a3;
			System.out.println(b4);} 
		else { System.out.println("Cat is not a Bird!!!");}

	}

}
