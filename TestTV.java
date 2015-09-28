class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;

	public TV() {
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (on && newChannel >=1 && newChannel <= 120)
			channel = newChannel;
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (on && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (on && volumeLevel > 1)
			volumeLevel--;
	}
}

public class TestTV {
	public static void main(String[] args) {
		TV tv1 = new TV();

		tv1.turnOn();
		tv1.setChannel(10);
		tv1.setVolume(5);

		TV tv2 = new TV();

		tv2.turnOn();
		tv2.setChannel(100);
		tv2.setVolume(4);

		System.out.printf("TV1 channel is %d volumeLevel is %d\n", tv1.channel, tv1.volumeLevel);
		System.out.printf("TV2 channel is %d volumeLevel is %d\n", tv2.channel, tv2.volumeLevel);
	}

}
