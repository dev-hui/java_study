package july_15th;

public class DoWhileTest02 {
	public static void main(String[] args) {
		int n1, n2;
		do {
			n1 = ((int) (Math.random() * 6) + 1); // 주사위 굴리기
			n2 = ((int) (Math.random() * 6) + 1); // 주사위 굴리기
		} while (n1 == n2);  // n1, n2가 같으면 다시 올라가서 반복함
		
		System.out.println(n1 + "," + n2);
	}

}
