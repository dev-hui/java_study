package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String id, String pw) throws IOException {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("id : " + id + ", pw : " + pw);
		fw.close();
	}
}
