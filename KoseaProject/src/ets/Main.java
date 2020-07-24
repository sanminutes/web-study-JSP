package ets;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[3];
		int[] X = new int[3];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (intArr[i] == intArr[j]) {
					i = -1;
					break;

				}

			}

		}

		for (int i = 0; i < X.length; i++) {
			X = sc.nextInt();
		}

	}
}
