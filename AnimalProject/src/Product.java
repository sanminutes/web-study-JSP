
public class Product {
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;

	}

	Product(String name) {
		this.name = name;
		this.price = 800;
	}

	Product(int price) {
		this.name = "¹°";
		this.price = price;

	}

	Product() {

	}
}