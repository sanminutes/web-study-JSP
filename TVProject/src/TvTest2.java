
public class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����߽��ϴ�.");
		t1.channelUp();
		System.out.println("t1�� channel���� 8�� �����߽��ϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}