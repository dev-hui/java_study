package api;

public class StringTest2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		printString(sb);
		sb.append("실수란 ");printString(sb);
		sb.append("신을 ");printString(sb);
		sb.append("용서하는 ");printString(sb);
		sb.append("인간의 ");printString(sb);
		sb.append("행위이다 ");printString(sb);
	}

	private static void printString(StringBuffer sb) {
		System.out.println(sb.capacity() + ":" + sb.length() + ":" + sb.toString());
	}
}
