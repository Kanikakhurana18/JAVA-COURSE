package arrays;

import java.util.Scanner;

public class ArraysBasics {
  public static void main(String[] args) {
    int[] arr= {6,78,99,7,3};  //1st way
     //indexing or access
      System.out.println(arr[4]);

      //output
      for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);

      //mutability: Updating
      arr[2]=100;
      System.out.println(arr[2]);

      //2nd way 
      int[] x= new int[3];
      x[0]=1; // assigning values
      x[2]=2;
      x[1]=3;
      //output
      for(int i=0;i<3;i++){
        System.out.println(x[i]);}

      //input
      int[] kanika = new int[7];
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<kanika.length;i++){
        kanika[i] = sc.nextInt();}
        System.out.println();

      //output
      for(int i=0;i<kanika.length;i++){
        System.out.print(2*kanika[i]+" ");}
       System.out.println();

      //or using ForEach loop
    for(int elem:kanika){     //for traversing/searching/printing data structures
      System.out.print(elem+" ");
    }
      }
      }
      


     

