package july_16th_oop10;

public class MarshallSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("Marshall Speaker : Volume UP!!!");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Marshall Speaker : Volume Down.....");		
	}

}
