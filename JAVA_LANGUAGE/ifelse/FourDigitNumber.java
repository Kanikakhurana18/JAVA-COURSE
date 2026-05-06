package ifelse;

import java.util.Scanner;

public class FourDigitNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no: ");
    int x=sc.nextInt();

    if(x>999 && x<1000) System.out.println("Four didgit no");
    else System.out.println("Not four digit no");
  }
}
