import java.util.Scanner;

public class Backjoon0720 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if (m == 1) {

			for (int i = 0; i < n; i++) {
				if (i < (n / 2) + 1) {
					for (int j = (n / 2) - i; j < (n / 2) + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					for (int j = i; j < n; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

		} else if (m == 2) {
			int tmp = (n / 2);
			for (int i = 0; i < n; i++) {
				if (i < (n / 2) + 1) {
					for (int j = 0; j < (n / 2) + 1; j++) {
						if (j >= tmp - i) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				} else {
					for (int j = 0; j < (n / 2) + 1; j++) {
						if (j <=n - i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}

		} else if (m == 3) {

		} else if (m == 4) {

		} else {
			System.out.println("INPUT ERROR!");
		}

	}
}
