package loops;

import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=1;
    int b=n;
    for(int i=1;i<=n;i++){
      if(i%2!=0) {System.out.println(a);
        a++;
      }
      else{ System.out.println(b);
      b--;
      };
    }
  }
}
