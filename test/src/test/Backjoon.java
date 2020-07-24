package test;

import java.util.Scanner;

public class Backjoon {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String st = sc.nextLine();
      //문자열의 앞과 뒤에 공백이 있을 수 있다. 따라서 띄어쓰기의 수로 판단하기는 어려움.
      st = st.trim();// 앞뒤 공백제거
      
      String newst = st.replaceAll(" ", "");//일단 문자열 내부의 공백을 모두 없앤 다음 앞뒤에 공백이 있다면 제거해 주기.

      int answer = st.length() - newst.length();
      
      System.out.println(st.length());
      System.out.println(newst.length());

      System.out.println(answer + 1);//마지막에 원문이랑 알파벳 갯수 비교해서 그 차+1만큼이 답.
   }
}

