package exception;

import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		String id="next";
		String pw="11111";
		
		try {
			if (id.equals("next") && pw.equals("1111")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
				throw new LoginFailException(id, pw);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
