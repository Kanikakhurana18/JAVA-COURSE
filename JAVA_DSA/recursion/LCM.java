package recursion;

import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int m= sc.nextInt();
    System.out.print("Enter second number: ");
    int n= sc.nextInt();
    System.out.println("LCM= "+lcm(m,n));
  }
  public static int lcm(int m, int n){
    return(m*n)/ gcd(m, n);
  }
  // Euclidean Algorithm
    public static int gcd(int m, int n) {
        if (m == 0) return n;
        return gcd(n%m, m);
      

  //Brute force using loop  Tc=O(a*b) SC
//   public static int lcm(int a, int b) {


//    for (int i = Math.max(a, b); true; i++) { //No condition as it empty then it 
// //written as true means infinte loop as [for(initialization; condition; update)]
// //for(;;) while(true)  Ye tab tak chalte hain jab tak andar se return ya break
//         if (i % a == 0 && i % b == 0)
//             return i; //jaise hi pehla common multiple milta hai, function wahi se return ho jata hai.
//     }
// }
    }
}
