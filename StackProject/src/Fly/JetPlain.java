package Fly;
import Fly.Flyable;
import Fly.Plain;
import Fly.Soundable;

public class JetPlain extends Plain implements Flyable, Soundable {

	public void sound() {
		System.out.println("��Ʈ�� �Ҹ� : ����������-!");
	}
	
	public void fly() {
		System.out.println("��Ʈ�Ⱑ ���󰩴ϴ�.");
	}
}
