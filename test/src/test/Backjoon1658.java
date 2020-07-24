package test;

import java.util.Scanner;

public class Backjoon1658 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] Arr = new int[A];
		int[] Brr = new int[B];
		// 각 A와 B의 약수를 구하기
		for (int i = 1; i <= A; i++) {
			if (A % i == 0) {
				Arr[i - 1] = i;
			}
		}
		for (int i = 1; i <= B; i++) {
			if (B % i == 0) {
				Brr[i - 1] = i;
			}
		}

		// 공약수 구하기
		int max = 0;
		for (int i = Arr.length - 1; i >= 0; i--) {
			for (int j = Brr.length - 1; j >= 0; j--) {
				if (Arr[i] == Brr[j]) {
					if (Brr[j] > 0) {
						if (max < Brr[j]) {
							max = Brr[j];
						}
					}
				}
			}
		}
		System.out.print(max);
		
		for (int i = 1; i <= A; i=+A) {
			if (A % i == 0) {
				Arr[i - 1] = i;
			}
		}
		for (int i = 1; i <= B; i=+B) {
			if (B % i == 0) {
				Brr[i - 1] = i;
			}
		}
		/*
		 * for (int i = 0; i < Arr.length; i++) { if (Arr[i] > 0)
		 * System.out.println(Arr[i]); }
		 * System.out.println("---------------------------"); for (int i = 0; i <
		 * Brr.length; i++) { if (Brr[i] > 0) System.out.println(Brr[i]); }
		 */
	}
}
