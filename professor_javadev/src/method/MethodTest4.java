package method;

public class MethodTest4 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356,5,6,3,1,2,3,4,6,57,45,6,54,57,56,674,346,54,754,75,4356);
	}

	private static void print(int... i) { // java5 가변형 파라메터 처리
		/*for(int j=0; j < i.length; j++) {
			System.out.print(i[j] + "\t");
		}*/
		for(int j : i) {					// since java 5 : enhanced for
			System.out.print(j + "\t");
		}
		System.out.println();
	}
}