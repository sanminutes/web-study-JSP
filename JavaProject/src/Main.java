import java.util.Scanner;

public class Main {
	public static void main(String argsp[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char ch = 65;
		int cnt = 0;

		for (int i = 0, m = 0; i < N; i++, m++) {
			for (int j = 1; j < N - i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = N - m; j >= N - m; j--) {
				if (ch > 'Z') {
					ch = 'A';
				}
				System.out.print(ch++ + " ");

				if (i >= N - cnt - 1) {
					i = -1;
					cnt++;
					m = -1;
				}
			}
			System.out.println();

		}
	}

}
