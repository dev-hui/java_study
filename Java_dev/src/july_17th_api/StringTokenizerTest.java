package july_17th_api;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("서태웅, 강백호| 채치수, 정대만| 송태섭", ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
