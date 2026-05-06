package loops;

import java.util.Scanner;
import java.util.*;

public class CountDigits {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int count=0;
    // while(n!=0){
    //   n/=10;
    //   count++;
    // }

    // for(;n!=0;n/=10){
    //   count++;
    // }
    

    // int count=(int)(Math.log10(n)+1);

    int count =String.valueOf(n).length();
    System.out.println(count);
  }
}
