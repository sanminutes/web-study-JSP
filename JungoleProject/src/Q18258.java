import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Q18258 {
	public static void main(String args[]) {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		Queue q = new LinkedList();

		int N = sc.nextInt();
		int number = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			if (str.equals("push")) {
				number = sc.nextInt();
				q.offer(number);

			} else if (str.equals("front")) {
				if (!q.isEmpty()) {
					System.out.println(q.peek());
				} else {
					System.out.println("-1");
				}

			} else if (str.equals("back")) {
				if (!q.isEmpty()) {
					System.out.println(number);
				} else {
					System.out.println("-1");
				}

			} else if (str.equals("size")) {
				System.out.println(q.size());
			} else if (str.equals("empty")) {
				if (!q.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
			} else if (str.equals("pop")) {
				if (!q.isEmpty()) {
					System.out.println(q.remove());
				} else {
					System.out.println("-1");
				}
			}

		}

	}
}
