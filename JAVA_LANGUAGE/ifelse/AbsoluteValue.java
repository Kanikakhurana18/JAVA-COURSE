package ifelse;

import java.util.Scanner;

public class AbsoluteValue {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number: ");
    int x=sc.nextInt();

    // if(x<0){
    //   x=-x;
    //   System.out.println(x);
    // }
    // else System.out.println(x);

    //or

    if(x<0) x=-x;
    System.out.println(x);
  }
}
