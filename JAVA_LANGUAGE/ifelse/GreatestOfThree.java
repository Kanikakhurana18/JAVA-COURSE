package ifelse;

import java.util.Scanner;

public class GreatestOfThree {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three no: ");
    int x=sc.nextInt();
    int y= sc.nextInt();
    int z= sc.nextInt();

    if(x>y && x>z) System.out.println("Greatest no: "+x);
    else if(y>x && y>z) System.out.println("Greatest no "+ y);
    else System.out.println("Greatest no "+ z);
}
}
