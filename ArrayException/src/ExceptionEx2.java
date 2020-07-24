
public class ExceptionEx2 {
public static void main(String args[]) {
	double number = 100;
	double result = 0;

		for (int i = 0; i < 10; i++) {
			result = (double)(number / (Math.random() * 10));
			System.out.println(result);
		}
	}
}
