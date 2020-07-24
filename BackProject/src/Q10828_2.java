import java.util.Scanner;
import java.util.Stack;

public class Q10828_2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//      SStack stk = new SStack();
      Stack stk2 = new Stack();

      int N = sc.nextInt();
      for (int i = 0; i < N; i++) {
         String s = sc.next();

         switch (s) {
         case "push":
            int num = sc.nextInt();
//            stk.push(num);
            stk2.push(num);
            break;
         case "top":
//            stk.top();
            if (stk2.isEmpty()) {
               System.out.println("-1");
            } else {
               System.out.println(stk2.peek());
            }
            break;
         case "size":
//            System.out.println(stk.size());
            System.out.println(stk2.size());
            break;
         case "empty":
//            System.out.println(stk.empty());
            if (stk2.isEmpty()) {
               System.out.println("1");
            } else {
               System.out.println("0");
            }

            break;
         case "pop":
//            stk.pop();
            if (stk2.isEmpty()) {
               System.out.println("-1");
            } else {
               System.out.println(stk2.pop());
            }

            break;
         }
      }
      sc.close();
   }
}