import java.util.Scanner;

public class jungoll521 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int[] intArr = new int[A];
		int cnt = 0;

		
		for (int i = 1; i <= intArr.length; i++) {
			intArr[i - 1] = A % i;
		}
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == 0) {
				cnt++;
				if (cnt == B) {
					System.out.println(i+1);
					break;
				}
			}
			if (i == intArr.length-1 && cnt != B) {
				System.out.println("0");
			}
		}

	}
}
