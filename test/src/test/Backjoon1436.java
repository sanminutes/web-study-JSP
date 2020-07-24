package test;

import java.util.Scanner;

public class Backjoon1436 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int cnt = 0, snt = 0;
		sc.close();
		while (true) {
			cnt++;
			String A = cnt + "";
			if (A.contains("666")) {
				snt++;
				if (snt == N) {
					break;
				}
			}
		}
		System.out.println(cnt);

	}
}
