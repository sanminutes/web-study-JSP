
public class RemoteControlExmple {
public void static main(String args[]) {
	RemoteControl rc1 = new Audio(); 
	rc1.turnOn(); 
	rc1.turnOff();
	RemoteControl rc2 = new RemoteControl() {
	@Override
	public void turnOn() {
	// TODO Auto-generated method stub 
	System.out.println("RemoteControl - turnOn()");
	}
	@Override
	public void turnOff() {
	// TODO Auto-generated method stub 
	System.out.println("RemoteControl - turnOff()");
	}
	@Override
	public void setVolume(int volume) {
	// TODO Auto-generated method stub
	Seoul Institute of Technology & 
	Education jungbu Campus
	}
	};
	rc2.turnOn(); 
	rc2.turnOff();
	}
}}
