package In;
public interface In3 extends In1, In2 {
	public class InterfaceTest3 {
		public static void main(String[] args) {
			ExtendsTest et = new ExtendsTest();

			et.in1Method();
			et.in2Method();

			System.out.println(In1.x);
			System.out.println(In2.x);
		}
	}

}
