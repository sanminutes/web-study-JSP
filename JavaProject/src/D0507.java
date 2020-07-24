import java.util.Scanner;

public class D0507 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[][] ChaArr = new char[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = N - i; j <= N - i; j++) {
				ChaArr[i][j - 1] = 'A';
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(ChaArr[i][j]);
			}
			System.out.println();
		}
	}
}
