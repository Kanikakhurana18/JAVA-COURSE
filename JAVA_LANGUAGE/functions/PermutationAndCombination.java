package functions;

import java.util.Scanner;

public class PermutationAndCombination {
   public static int Fact(int a){
  if(a<0)
    {System.out.println("Invalid no");
  return 0;}

  int fact=1;
  for(int i=1; i<=a;i++){
    fact*=i;
  }
  return fact;
}

public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int r= sc.nextInt();

  if(r > n){
      System.out.println("Invalid input r<=n");
      return;
    }

  int ncr=Fact(n)/(Fact(r)*Fact(n-r));// combination
  System.out.println(ncr);

  //permutation
  int ncp= Fact(n)/Fact(n-r);
  System.out.println(ncp);
}
}

