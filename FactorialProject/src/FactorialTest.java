import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // A는 고정비용
		int B = sc.nextInt(); // B는 가변비용
		int C = sc.nextInt(); // C는 한대가격
		sc.close();

		int P1 = A + B;
		int tmp = 1;
		// 한대 생산하는데 A+B의 가격이 든다. 이후 B가격만 상승
		// 1대의가격
		while (P1 % C != 0) {
			P1 += B;
			tmp = P1 / C;

		}

		System.out.println(tmp + 1);

	}
}
