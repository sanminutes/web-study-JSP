
public class Tv {

	String color; //����
	boolean power; //��������
	int channel; //ä��

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}
