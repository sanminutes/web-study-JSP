import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // A�� �������
		int B = sc.nextInt(); // B�� �������
		int C = sc.nextInt(); // C�� �Ѵ밡��
		sc.close();

		int P1 = A + B;
		int tmp = 1;
		// �Ѵ� �����ϴµ� A+B�� ������ ���. ���� B���ݸ� ���
		// 1���ǰ���
		while (P1 % C != 0) {
			P1 += B;
			tmp = P1 / C;

		}

		System.out.println(tmp + 1);

	}
}
