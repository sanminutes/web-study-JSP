
public class TvTest {
	public static void main(String args[]) {
		Tv t; // �����ϱ� ���� ���� ����
		t = new Tv();
		t.power();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.power);
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");

	}
}
