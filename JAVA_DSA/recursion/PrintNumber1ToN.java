package recursion;
import java.util.*;

public class PrintNumber1ToN { //Tc and SC =O(n)
  //Method-1 is preferred
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    print(1,n); //2 parameters for stopping condition
  }
  public static void print(int x , int n){
    if(x>n)return ;
    System.out.println(x);
    print(x+1,n);
  }

  
  //Using one paramter(n) //Using callback
  // public static void print(int n){
  //   if(n==0)return ;
  //   print(n-1); //next method call
  //   System.out.println(n); //last mai print ho gaya 1 to n
  // }


  //Method-2 Using Global Variable n
  // static int n; //Globla variable
  // public static void main(String[] args){
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter your number: ");
  //   n= sc.nextInt(); //NO int otherwise become global variable
  //   print(1);
  // }
  // public static void print(int x){
  //   if(x>n) return;
  //   System.out.println(x);
  //   print(x+1);
  // }
}
