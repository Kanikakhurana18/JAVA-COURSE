package recursion; //TC -Maximum no. of calls in call stack //SC- No. of parameters*No. of calls
import java.util.*;

public class PrintNumberNto1 {
  public static void print(int n){
    if(n==0) return;
    System.out.println(n);
    print(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    print(n);
  }
}
