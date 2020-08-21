package july_16th_oop10;

public class HarmanSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : Volume UP!!!!");

	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : Volume Down...");
	}

}
