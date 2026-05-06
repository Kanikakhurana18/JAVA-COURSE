package patterns;

import java.util.Scanner;

public class Butterfly {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

    //upper
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");//1st part upper
      }
      for(int j=1;j<=(2*(n-i));j++){
        System.out.print("  ");// spaces in bw
      }
      for(int j=1;j<=i;j++){
        System.out.print("* "); //2ns part upper
      }
      System.out.println();
    }


    //lower
    for(int i=n;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("* ");//1st part upper
      }
      for(int j=1;j<=(2*(n-i));j++){
        System.out.print("  ");// spaces in bw
      }
      for(int j=1;j<=i;j++){
        System.out.print("* "); //2ns part upper
      }
      System.out.println();
    }
  }
}
