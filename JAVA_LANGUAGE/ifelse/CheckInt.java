package ifelse;

import java.util.Scanner;

public class CheckInt {
  public static void main(String[] args) {
    System.out.println("Enter number: ");
    Scanner sc= new Scanner(System.in);
    double x= sc.nextDouble();

    int n= (int)x;
    if(n-x==0) System.out.println("Number is integer");
    else System.out.println("not integer");
  }
}
