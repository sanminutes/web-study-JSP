import java.util.Scanner;

public class First {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp[] = new int[10];

      for (int i = 0; i < inp.length; i++) {
         inp[i] = sc.nextInt();
      }
      sc.close();
//      for (int i = 0; i < inp.length; i++) {
//         System.out.print(inp[i] + " ");
//      }
//95 100 88 65 76 89 58 93 77 99
      // 1. 최대값을 찾는다
      // 2. 찾은 최대값을 다른 값으로 변경한다
      int max = -1, idx = -1, cnt = inp.length - 1;
      while (cnt-- >= 0) {
         max = -1;
         idx = -1;
         for (int i = 0; i < inp.length; i++) {
            if (max < inp[i]) {
               max = inp[i];
               idx = i;
            }
         }
         System.out.print(max + " ");
         inp[idx] = -99;
      }
   }
}
