import java.util.Scanner;

public class Main575j {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.println(power(a, b));
	}

	static int power(int a, int b) {
		if (b == 1)
			return a;
		return a * power(a, b - 1);
	}
}
