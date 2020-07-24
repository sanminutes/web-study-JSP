import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class que {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue q = new LinkedList();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			char ch = sc.next().charAt(0);
			if(ch=='i') {
				int a = sc.nextInt();
				q.add(a);
			}else if(ch=='c') {
				System.out.println(q.size());
			}else if(ch=='o') {
				if(!q.isEmpty()) {
					System.out.println(q.peek());
					q.remove();
				}else {
					System.out.println("empty");
				}
			}
		}
	}
}
