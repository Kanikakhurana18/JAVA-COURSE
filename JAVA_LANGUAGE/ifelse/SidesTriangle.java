package ifelse;

import java.util.Scanner;

public class SidesTriangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first side: ");
    int x=sc.nextInt();
    System.out.println("Enter second side: ");
    int y=sc.nextInt();
    System.out.println("Enter third side: ");
    int z=sc.nextInt();

    if(x+y>z && y+z>x && x+z>y) System.out.println("valid triangle");
    else System.out.println("Not valid triangle");
}
}
