package oop10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) {
		try {
			Properties pr = new Properties();
			pr.load(new FileInputStream("src/oop10/product.properties"));	// throw new IOException();
			String tvName = pr.getProperty("tv");
			Class clazz = Class.forName(tvName);
			String speakerName = pr.getProperty("speaker");
			Class clazzSpeaker = Class.forName(speakerName);
			TV tv = (TV) clazz.newInstance();
			tv.setSpeaker((Speaker)clazzSpeaker.newInstance());
			tv.powerOn();
			tv.channelUp();
			tv.channelUp();
			tv.soundUp();
			tv.soundUp();
			tv.soundDown();
			tv.powerOff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
