package july_16th_oop10;

public class AppleTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("I am APPLE TV! Power on!!");
	}

	@Override
	public void powerOff() {
		System.out.println("I am APPLE TV! Power off!!");
		
	}

	@Override
	public void channelUp() {
		System.out.println("I am APPLE TV! Channel Up!!");
		
	}

	@Override
	public void channelDown() {
		System.out.println("I am APPLE TV! Channel Down!!");
		
	}

	@Override
	public void soundUp() {
		System.out.println("I am APPLE TV! Sound Up!!");
		
	}

	@Override
	public void soundDown() {
		System.out.println("I am APPLE TV! Sound Down!!");
		
	}

	
}
