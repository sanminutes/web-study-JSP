import java.util.Scanner;

public class Jungol572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		sc.close();

		System.out.printf("%.2f", circle(A));

	}

	public static double circle(int A) {
		double B = A * A * 3.14;
		return B;
	}

}
