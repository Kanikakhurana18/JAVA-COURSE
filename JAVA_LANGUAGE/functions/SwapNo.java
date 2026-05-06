package functions;

import java.util.Scanner;

public class SwapNo {
  public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Two numbers are: "+ a+" "+b);
  swap(a,b);
  }

  public static void swap(int a, int b){
    int temp=a; 
    a=b; 
    b=temp;
    System.out.println("Swapped numbers are: "+a+" "+ b);
  }
}
