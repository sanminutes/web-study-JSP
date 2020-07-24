import java.util.Scanner;

public class Jungol2514 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		int kcnt=0;
		int icnt=0;
		for (int i=0; i<str.length()-2; i++) {
//			System.out.println(str.substring(i, i + 3));
			if ((str.substring(i, i+3)).equals("KOI")) {
				kcnt++;
			} else if ((str.substring(i, i+3)).equals("IOI")) {
				icnt++;
			}
		}
		System.out.println(kcnt);
		System.out.println(icnt);
	}
}