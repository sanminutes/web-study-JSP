package ets;

public class ProductTest {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(Serial no)�� " + p1.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(Serial no)�� " + p2.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(Serial no)�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� "+Product.count+"�� �Դϴ�.");
	}
}
