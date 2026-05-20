package strings;

import java.util.Scanner;

public class CountDigitsWithoutLoop {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    // //with loop
    // int count=0;
    // while(n!=0){
    //   n/=10;
    //   count++;
    // }
    // System.out.println(count);

    //with loop
    String s= Integer.toString(n); //integer to string find kr lo
    System.out.println(s.length());
  }
}
