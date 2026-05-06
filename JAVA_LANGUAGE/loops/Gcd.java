package loops;

import java.util.Scanner;

public class Gcd {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
      //  while(a!=b){ // subtraction euclidian algo
      //      if(a>b){
      //          a=a-b;
      //      }
      //      if(b>a){
      //          b=b-a;
      //      }
      //  }
      //  System.out.println(a);

    // Modulus euclidian algo-> more fastest
    // while(a>0 && b>0){
    //        if(a>b){
    //            a=a%b;
    //        }
    //        else{
    //            b=b%a;
    //        }
    //    }
    //    if (a == 0){ System.out.println(b);}
    //    System.out.println(a);

    //or using modulus swapping
    while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

}
  
