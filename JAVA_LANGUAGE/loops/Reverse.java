package loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int r=0;

    // while(n!=0){
    //   r*=10;
    //   r+=n%10;
    //   n/=10;
    // }
    // System.out.println(r);

    int revnum=0;
        while(n!=0){
            if(revnum>Integer.MAX_VALUE/10|| revnum<Integer.MIN_VALUE/10)
            return;
           else{ revnum*=10;
            int ld=n%10;
            revnum= revnum+ld;
            n/=10;}
        }
        System.out.println(revnum);
     }
}
