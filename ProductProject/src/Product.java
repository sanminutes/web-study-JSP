
public class Product {

	private String name;
	private int price;
	public void printProduct() {
		System.out.print("제품명 : " + name);
		System.out.println(", 가격 : " + price );
	}

	public String getName() {
		return name;
	}

	public void setName(String new_name) {
		name = new_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int new_price) {
		if(new_price>=0) {
		price = new_price;
		}
	}

	

}
