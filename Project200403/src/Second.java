import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int A = sc.nextInt();
		sc.close();
		if (A > str.length()) {
			A = str.length();
		}

		for (int i = str.length(); i > str.length() - A; i--) {
			char ch = str.charAt(i - 1);
			System.out.print(ch);
		}
	}
}
