//Cannot make a static reference to the non-static field Calculator2.pi


public class CalculatorExample {

	public static void main(String[] args) {
		Calculator2 Cal = new Calculator2();
		double result1 = 10 * 10 * Cal.pi;
		int result2 = Cal.plus(10, 5);
		int result3 = Cal.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
