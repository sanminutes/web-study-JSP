//push pop peek empty search

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			stk.clear();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == '(') {
					stk.push(1);
				} else {
					if (stk.empty() == false) {
						stk.pop();
					} else {
						System.out.println("NO");
						break;
					}

				}
				if (j == str.length() - 1) {
					if (stk.empty() == false) {
						System.out.println("NO");
					} else {
						System.out.println("YES");

					}
				}
			}

		}
	}

}
