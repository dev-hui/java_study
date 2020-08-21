package july_16th_oop10; // 인터페이스!!

public interface TV {  // 표준을 만들기 위해서 존재함
	public default void setSpeaker(Speaker speaker) {}
	public void powerOn();
	public void powerOff(); 
	public void channelUp(); 
	public void channelDown(); 
	public void soundUp();
	public void soundDown(); 
}
