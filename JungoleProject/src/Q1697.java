import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//empty,  size, front, back, push, pop
public class Q1697 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue q = new LinkedList();

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			if (str.equals("i")) {
				int number = sc.nextInt();
				q.add(number);
			} else if (str.equals("c")) {
				System.out.println(q.size());
			} else if (str.equals("o")) {
				if (!q.isEmpty()) {
					System.out.println(q.remove());
				} else {
					System.out.println("empty");
				}

			}

		}

	}

}
