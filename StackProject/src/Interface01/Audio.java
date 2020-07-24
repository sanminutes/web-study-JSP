package Interface01;

public class Audio implements RemoteControl {
	private int volume;

	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		} else {
			this.volume = volume;
		}

		System.out.println("ÇöÀç Audio º¼·ý : " + this.volume);
	}
}
