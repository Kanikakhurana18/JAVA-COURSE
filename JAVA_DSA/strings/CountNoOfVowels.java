package strings;

import java.util.Scanner;

public class CountNoOfVowels {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    int count =0;
    for(int i=0;i<s.length();i++){
      char ch= Character.toLowerCase(s.charAt(i));// converts uppercase to lowerscase and count them  //index find krna hai with charcater of vowels
      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
        count++;
      }
    }
       System.out.println(count);
  }
}
