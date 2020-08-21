package api;

public class StringTest3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		printString(sb);
		sb.append("실수란 ");printString(sb);
		sb.append("신을 ");printString(sb);
		sb.append("용서하는 ");printString(sb);
		sb.append("인간의 ");printString(sb);
		sb.append("행위이다 ");printString(sb);
	}

	private synchronized static void printString(StringBuilder sb) {
		System.out.println(sb.capacity() + ":" + sb.length() + ":" + sb.toString());
	}
}
