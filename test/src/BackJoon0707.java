import java.util.Scanner;

public class BackJoon0707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String Str = null;
		for (int i = 0; i < N; i++) {
			Str = sc.next();
		}
		sc.close();
		int cnt = 0, sum = 0;
		for (int i = 0; i < Str.length(); i++) { // 배열 선택
			for (int j = 0; j < Str.length(); j++) { // 선택한 배열 하나씩
				if (Str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}

	}
}
