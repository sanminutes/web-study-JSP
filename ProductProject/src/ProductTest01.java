
public class ProductTest01 {
	public static void main(String[] args) {

		Product[] pro = new Product[4];
		String[] pd = new String[] { "커피", "웰치스", "포카리", "비타500" };
		int[] price = new int[] { 150, 700, -500, 500 };

		for (int i = 0; i < pd.length; i++) {
			pro[i] = new Product();
			pro[i].setName(pd[i]);
			pro[i].setPrice(price[i]);
		}

		for (int i = 0; i < pd.length; i++) {
			pro[i].printProduct();
		}

	}

}
