package july_15th;

public class ArrayTest02 {
	public static void main(String[] args) {

		int[][] score = { 
				{ 100, 90, 80, 70 }, // score[0][0, 1, 2, 3]
				{  90, 80, 70, 60 }, // score[1][0, 1, 2, 3]
				{  80, 70, 60, 50 }  // score[2][0, 1, 2, 3]
		};
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
//		for (int row = 0; row < score.length; row++) {
//			for (int col = 0; col < score[row].length; col++) {
//				System.out.println(score[row][col] + "\t");
//			}
//		}

		for (int row = 0; row < score.length; row++) { // 행
			int sum = 0;
			for (int col = 0; col < score[row].length; col++) { // 렬
				System.out.print(score[row][col] + "\t");			
				sum += score[row][col];
			}
			System.out.println(sum+"\t"+sum/(score[row].length));
		}
		
	}
}