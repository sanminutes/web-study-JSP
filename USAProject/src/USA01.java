import java.util.Scanner;

public class USA01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[26];
		String str = sc.next();
		int tmp = 0;
		int multi = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			tmp = ch - 'A';
			intArr[tmp] += 1;
		}
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > 0) {
				if (multi == 0) {
					multi = i + 1;
				} else {
					multi *= (i + 1);
				}

			}

		}
		int result = multi % 47;
		System.out.println(result);
	}

}
