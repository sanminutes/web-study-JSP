package SedanFactory;

//import Component.Tire;

public class Sedan {
	public static void main(String args[]) {
		Component.Tire compoTire = new Component.Tire();
		compoTire.setSize(20);
		
		System.out.println(compoTire.getSize());
	}
}
