package functions;
import  java.util.*;

public class Factorial {
  public static int Fact(int a){
  if(a<0)
    {System.out.println("Invalid no");
  return 0;}

  int fact=1;
  for(int i=1; i<=a;i++){
    fact*=i;
  }
  System.out.println(fact);
  return fact;
}

public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  Fact(n);
}

}
