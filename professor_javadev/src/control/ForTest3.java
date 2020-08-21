package control;

public class ForTest3 {
	public static void main(String[] args) {
		/*
		  	for(int i=0Xac00;i <= 0Xd7a3; i++) {
				System.out.println((char)i);
			}
			System.out.println();
		*/
		for(char c='가',i=1;c <= '힣'; c+=(28*21),i++) {
			System.out.print(c);
			if (i % 10 == 0) System.out.println();
		}
	}
}
