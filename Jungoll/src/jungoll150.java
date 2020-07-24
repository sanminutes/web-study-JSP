import java.util.Scanner;

public class jungoll150 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		char[] chArr = new char[10];
		
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = sc.next().charAt(0);
		}
		sc.close();
		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i] + " ");
		}
	}
}
