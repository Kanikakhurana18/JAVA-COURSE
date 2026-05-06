package patterns;

import java.util.Scanner;

public class SmallBigAlphabet {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(i%2==0){
          System.out.print((char)(i+97));
        }
        else System.out.print((char)(i+65));
      }
      System.out.println();
    }
  }
}
