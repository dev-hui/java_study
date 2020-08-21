package july_17th_exception;

import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		String id = "next";
		String pw = "1111";
		
		try {
			if (id.equals("next") && pw.equals("1111")) {
				System.out.println("WELCOME TO THE PARAISO!");
			} else { 
				System.out.println("NOT INVITED");
				throw new LoginFailException(id, pw);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
