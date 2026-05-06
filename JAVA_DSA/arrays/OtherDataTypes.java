package arrays;

import java.util.Scanner;

public class OtherDataTypes {
  public static void main(String[] args) {
    //default  values
  // String[] x= new String[4];
  // for(int i=0;i<4;i++){
  //   System.out.println(x[i]);
  // }
   Scanner sc= new Scanner(System.in);
   String[] x= new String[4];
   for(int i=0;i<4;i++){
    x[i]= sc.nextLine();
   }
   //output
  for(int i=0;i<4;i++){
    System.out.print(x[i]);
  }
  System.out.println();

  //default
  double[] y= new double[4];
  for(int i=0;i<4;i++){
    System.out.println(y[i]);
  }
}
}
