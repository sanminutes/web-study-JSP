package Fly;
import Fly.Flyable;
import Fly.Plain;
import Fly.Soundable;

public class JetPlain extends Plain implements Flyable, Soundable {

	public void sound() {
		System.out.println("제트기 소리 : 슈우우우우우우웅-!");
	}
	
	public void fly() {
		System.out.println("제트기가 날라갑니다.");
	}
}
