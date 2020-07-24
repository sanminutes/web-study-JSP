
public class BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println(" { }");
	}

	public BlockTest() {
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlckTest();");
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlckTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
