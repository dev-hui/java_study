package july_17th_exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String id, String pw) throws IOException  {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file, true); // 기존 데이터 남아있고 계속 추가되는 것
		fw.write("id : " + id + ", pw : " + pw);
		fw.close();
	}

}
