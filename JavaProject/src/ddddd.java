import java.util.Scanner;

public class ddddd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int max = 0;
		int tmp = 0;
		int min = -9999;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			tmp += num;
			if (num <= 0) {
					if (min < num) {
						min = num;
					}
			}
			if (tmp < 0) {
				tmp = 0;
			}
			if (max < tmp) {
				max = tmp;
			}

		}
		sc.close();
		if (max == 0) {
			System.out.print(min);
		} else {
			System.out.print(max);
		}
	}
}
