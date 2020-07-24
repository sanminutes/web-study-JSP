import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int m = 0;
		for (int i = 1; i < N; i++) {
			cnt++;
			m += i;
			if (m > N) {
				break;
			}
		}
		System.out.println(cnt);
		System.out.println(m);

	}

}
