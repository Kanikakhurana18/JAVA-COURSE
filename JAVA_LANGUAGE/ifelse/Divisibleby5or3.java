package ifelse;

import java.util.Scanner;

public class Divisibleby5or3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no: ");
    int x=sc.nextInt();

    if(x%5==0 && x%3==0) System.out.println("Divisible by 5 or 3");
    else System.out.println("not divisible");
}
}
