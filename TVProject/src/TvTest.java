
public class TvTest {
	public static void main(String args[]) {
		Tv t; // 참조하기 위한 변수 선언
		t = new Tv();
		t.power();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.power);
		System.out.println("현재 채널은 " + t.channel + "입니다.");

	}
}
