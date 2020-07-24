//The field Thing.x is not visible

public class ThingTest01 {
public static void main(String[] args) {
	Thing thing1;
	thing1 = new Thing();
	thing1.setX(10);
	System.out.println(thing1.getX());
}
}
