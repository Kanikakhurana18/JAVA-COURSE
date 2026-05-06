package ifelse;

import java.util.Scanner;

public class Divisibleby5 {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    
//     if(x>0){
//     if(x%5==0) System.out.println("Number is divisble by 5");
//     else System.out.println("Not divisible by 5");}

//     else System.out.println("Not positive integer");
// }


//or 

if (x <= 0) {
    System.out.println("Not a positive integer");
} else if (x % 5 == 0) {
    System.out.println("Number is divisible by 5");
} else {
    System.out.println("Not divisible by 5");
}
}
}

