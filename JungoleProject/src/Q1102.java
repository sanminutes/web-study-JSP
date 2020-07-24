import java.util.Scanner;
import java.util.Stack;

public class Q1102 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack();

		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			char ch = sc.next().charAt(0);
			if (ch=='i') {
				int number = sc.nextInt();
				stk.push(number);
			} else if (ch=='c') {
				System.out.println(stk.size());
			} else if (ch=='o') {
				if (!stk.empty()) {
					System.out.println(stk.pop());
				} else {
					System.out.println("empty");
				}
			}
		}

	}

}
