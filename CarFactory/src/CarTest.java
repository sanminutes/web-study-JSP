
class CarTest {
	public static void main(String args[]) {
		Car c1 = new Car();
		Car c2 = new Car(c1);

		System.out.println("c1�� color =" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color =" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		c1.door = 100;
		System.out.println("c1.door=100; ������");
		System.out.println("c1�� color =" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color =" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}