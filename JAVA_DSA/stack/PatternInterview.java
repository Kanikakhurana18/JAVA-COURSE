package stack;

import java.util.*;

public class PatternInterview { //TC= O(max*n) =O(n) SC=O(1)
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your number: ");
    int num=sc.nextInt(); //436135
    String s= String.valueOf(num); //break the integer digits

    //find maximum digit in number
    int max=0;
    for(int i=0;i<s.length();i++){
      int digit=s.charAt(i) -'0'; //uss character value se 0 ki character value(48) subtract krne se wali integer value return hoti hai jo ek integer hai 
      if(digit>max) max=digit;
    }
    for(int row=1; row<=max;row++){
      for(int i=0;i<s.length();i++){
        int digit=s.charAt(i)-'0';
        
        if(digit>=row) System.out.print("* ");
        else System.out.print("  ");
      }
      System.out.println();
    }
  }
}
