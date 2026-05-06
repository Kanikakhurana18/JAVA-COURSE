package patterns;

import java.util.Scanner;

public class FlippedTriangle {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a=n;
    
    // for (int i = 1; i <=n; i++) {
    //   for (int j = 1; j <= n+1-i; j++) {
    //     System.out.print((char)(j+64)+(" "));
    //   }
    // System.out.println();}

    for(int i=1;i<=n;i++){
      for(int j=1;j<=a;j++){
        System.out.print("*");
        }
        a--;
      System.out.println();
    }
  }
}
