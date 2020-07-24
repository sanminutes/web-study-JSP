import java.util.Scanner;

public class Q1339 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int numbering = 0;
		for (int i = 1; i < N; i++) {
			if (i % 2 != 0) {
				numbering += i;
			}
		}
		System.out.println(numbering);
		System.out.println(numbering % 26);
		char S = (char) ('A' + numbering);
		if (S > 90) {
			int P = numbering % 26;
			System.out.println(P);
			S = (char) (65 + P);

		} // 시작 알파벳 찾기

		int cnt = 0;
		if (N >= 1 && N <= 100) {
			if (N % 2 != 0) {

				for (int i = 0; i < N; i++, S++) {
					if (i <= N / 2) {
						for (int j = N - i; j <= N; j++) {
							if (j + i == N) {
								System.out.print(S);
							} else {
								cnt++;
								System.out.print(M(S, N, cnt));

							}
						}

						System.out.println();
						cnt = 0;
					} else if (i > N / 2) {
						for (int j = N; j > i; j--) {
							if (j == N) {
								System.out.print(S);
							} else {
								cnt++;
								System.out.print(M(S, N, cnt));

							}
						}
						System.out.println();
						cnt = 0;
					}

					if (S >= 'Z') {
						S = 64;
					}

				}

			} else {
				System.out.println("INSERT ERROR");
			}
			// 출력

		}
	}

	public static char M(char S, int N, int cnt) {
		for (int i = 0; i < cnt; i++, N -= 2)
			if (S - (N - 1) >= 'A') {
				S = (char) (S - (N - 1));
			} else {
				S = (char) ('Z' - (N-1));

			}
//m-3+1

		return S;
	}
}
