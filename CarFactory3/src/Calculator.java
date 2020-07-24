
public class Calculator {

	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height){
		return width * height;
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	double division(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

//	double plus(double x, double y) {
//		double result = x + y;
//		return result;
//	}

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		int res1 = myCalc.plus(5, 10);
		int res2 = myCalc.minus(10, 2);
		double res3 = myCalc.division(5, 2);
		int res4 = myCalc.multiply(3, 9);
		double result1 = myCalc.areaRectangle(4);
		double result2 = myCalc.areaRectangle(4, 6);
//		double res2 = myCalc.plus(10.5, 20.3);

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(result1);
		System.out.println(result2);
//		System.out.println(res2);
	}

}
