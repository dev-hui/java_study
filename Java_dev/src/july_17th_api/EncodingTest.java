package july_17th_api;

import org.apache.commons.codec.digest.DigestUtils;

public class EncodingTest {
	public static void main(String[] args) {
		String password = "1234";
		password = DigestUtils.sha512Hex(password);
		System.out.println(password);
	}

}
