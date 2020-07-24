package test;

import java.util.Scanner;

public class Backjoon0716 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	      String ori = sc.nextLine();
	      String str = ori;
	      String[] array = str.split(" ");
	      int count=0;
	      
	      for (int i = 0; i < array.length; i++) {
	         
	         //System.out.println(array[i]);
	         
	         count++;
	      }
	      
	   
	         System.out.println(count);
	      
	      sc.close();
	}
}
