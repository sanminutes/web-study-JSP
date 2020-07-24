import java.util.Scanner;

public class hhhh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int star = sc.nextInt();
		sc.close();

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = star; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
