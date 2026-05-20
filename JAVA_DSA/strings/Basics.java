package strings;

import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    char[] arr={'K','a','n','u'};
    //OUTPUT
    for (char c : arr) { //character array= strings
      System.out.print(c);
    }
    System.out.println();

    //OR
    String s= "Kanika";
    System.out.println(s);

    //INPUT
    Scanner sc= new Scanner(System.in);
    // String word= sc.next();
    // System.out.println(word);
    // String line= sc.nextLine();
    // System.out.println(line);

    //CharAt()[indexing] and length()[size of string]
    String len= "Kanika and Radha";
    int n= len.length();
    System.out.println(n);
    System.out.println(len.charAt(11)); //indexing includes spacing too
  }
}
