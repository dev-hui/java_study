package july_16th_oop10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) {
		try {
			Properties pr = new Properties();
			pr.load(new FileInputStream("src/july_16th_oop10/product.properties"));	// throw new IOException(); 예외 발생
			String tvName = pr.getProperty("tv");
			Class clazz = Class.forName(tvName);	// 의존 관계 없애기 위해서 new 안 들어가도 작동하게 하는 것
			
			// 이제 product.properties 파일만 수정하면 이 TVUser 파일 손대지 않아도 결과물 다 수정됨!!
			// 외부에 다 만들어 놓고 부품처럼 필요할 때 가져와서 사용하는 것.
			// 이를 도와주는 프레임워크가 바로 스프링!!
			
			String speakerName = pr.getProperty("speaker");
			Class clazzSpeaker = Class.forName(speakerName);
			TV tv = (TV) clazz.newInstance();
			tv.setSpeaker((Speaker)clazzSpeaker.newInstance());
			tv.powerOn();
			tv.channelUp();
			tv.channelDown();
			tv.soundUp();
			tv.soundDown();
			tv.powerOff();
		} catch (Exception e) {   // surround with try-catch block : 예외 처리 잡아줌
			e.printStackTrace();
		}
	}

}
