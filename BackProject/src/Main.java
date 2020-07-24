import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String A = sc.nextLine().trim();
      String[] B = A.split(" ");
      sc.close();

      System.out.println(B.length);

   }

}