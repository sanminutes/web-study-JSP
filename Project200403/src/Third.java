
import java.util.Scanner;

public class Third {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= 1 && arr[i] < 100) {
				if (max < arr[i]) {
					max = arr[i];
				}
			} else if (arr[i] >= 100 && arr[i] < 10000) {
				if (min > arr[i]) {
					min = arr[i];
				} else if (min == 0) {
					min = arr[i];
				}

			}
		}
		if (max == 0) {
			max = 100;
		}
		if (min == 0) {
			min = 100;
		}
		System.out.printf(max + " " + min);
	}
}
