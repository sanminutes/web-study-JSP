public class tes02 {
	public static void main(String args[]) {
		char c[] = new char[] { '+', '-', '/', '*' };
		double p;
		switch (c[3]) {
		case '+':
			p = 0;
			for (int i = 0; i < 5; i++, p += 1)
				;
			break;

		case '-':
			p = 0;
			for (int i = 0; i < 5; i++, p -= 1)
				;
			break;

		case '/':
			p = 1;
			for (int i = 0; i < 5; i++, p /= 1)
				;
			break;

		default:
			p = 1;
			for (int i = 0; i < 5; i++, p *= 1)
				;
		}
		System.out.printf("%.3f", p);
	}

}
