package recursion;

import java.util.Scanner;

public class ReverseString { //Time Complexity: O(n²) Space Complexity: O(n) recursion stack
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String you want to reverse: ");
    String s= sc.nextLine();
    System.out.println(reverse(s));
  }
  public static String reverse(String s){
    if(s.length()<=1) return s;
    return reverse(s.substring(1))+s.charAt(0);
  }
}
