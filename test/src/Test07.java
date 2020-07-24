
public class Test07 {
	public static void main(String args[]) {
		int i, j, k;

		i = 0;
		j = 1;
		k = 1;
		do {
			i++;
			j += i;
			k += j;
			System.out.println(i+"¹øÂ°"+ " : " + j);
		} while (i < 19);
		System.out.printf("%d", k);
	}
}
