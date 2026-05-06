package multiDimensinalArrays;
//2D ARRAY OR MATRIX

import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    // int[][] arr={{6,7,8},{7,8,9},{0,9},{4,5,5,3}};
    int [][] arr= new int[2][3]; //2 rows and  3 columns
    //input
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    //output
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){ //arr[0].length = length of first col so will use[i]
        System.out.print(arr[i][j]+" "); // no println 
      }
      System.out.println();
    }
  }
}
