
public class SStack {

	int[] intArr;
	int top;

	public SStack() {
		intArr = new int[10000];
		top = -1;

	}

	void push(int X) {
		intArr[++top] = X;

	}

	void pop() {
		if (top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(intArr[top]);
		}
	}

	int size() {
		return top + 1;
	}

	int empty() {
		if (top == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	int top() {
		return intArr[top];

	}
}
