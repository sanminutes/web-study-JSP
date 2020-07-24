import java.util.Scanner;

public class Q1534 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();

		while (N != 0) {
			if (N % B >= 10) {
				sb = sb.append((char) (55 + (N % B)));
				N = N / B;
			} else {
				sb = sb.append(N % B);
				N = N / B;
			}

		}
		System.out.println(sb.reverse());

	}

}
