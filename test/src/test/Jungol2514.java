package test;

import java.util.*;

public class Jungol2514 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String line = sc.next();
      sc.close();
      
      int cntK = 0;
      int cntI = 0;   
      int i1 = 0;
      int i2 = 0;

      boolean flg1 = true;
      boolean flg2 = true;
      
      while(flg1 || flg2) {
         
         if(i1 != -1)
         i1 = line.indexOf("KOI", i1);
         
         if(i2 != -1)
         i2 = line.indexOf("IOI", i2);
         
         if(i1 == -1) {
            flg1 = false;
         } else {
            cntK++;
            i1 = i1 + 2;
         }
         
         if(i2 == -1) {
            flg2 = false;
         } else {
            cntI++;
            i2 = i2 + 2;
         }
      }
      
      System.out.println(cntK);
      System.out.print(cntI);
   }
}