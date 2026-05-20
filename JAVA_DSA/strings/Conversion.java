package strings;

import java.util.Scanner;

public class Conversion {
  public static void main(String[] args) {
    //String+ int/char/string/double
    String s="Bhakti ";
    s+= "hi shakti hai";
    System.out.println(s);
    System.out.println('A'+10+"Kanika");

    //Integer to string
    int n=12345;
    // String d= " "; //empty string mai add integer
    // d+=n;
    // System.out.println(d);
    
    //OR
    String d =Integer.toString(n);
    System.out.println(d);

    //String to Integer
    String str="2345";
    int number= Integer.parseInt(str);
    System.out.println(number);

    //String to Character array
    String so="Kanika";
    char[] arr= so.toCharArray();
    for (char c : arr) {
      System.out.println(c);
    }

    //ANY DATATYPE TO STRING
    String h= String.valueOf(true); //boolean t or f small hote hai
    System.out.println(h);
  }
}
