import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		sc.close();
		System.out.println(str);
		
		if(str.isBlank()) {
			System.out.println(0);
		}else {
			String[] strArr = str.split(" ");
			System.out.println(strArr.length);
		}

	}
}
