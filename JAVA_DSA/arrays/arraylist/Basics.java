package arrays.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basics {
  public static void main(String[] args) {
    //Arraylist -> dyanmic arrays 
    ArrayList<Integer> arr= new ArrayList<>();
    System.out.println(arr); 
    arr.add(25);
    arr.add(21);
    System.out.println(arr.get(0));
    System.out.println(arr.set(1,23));
    System.out.println(arr);

    //converting arraylist to array
    int[] ans= new int[arr.size()];
    for(int k=0;k<arr.size();k++){
      ans[k]=arr.get(k);
    }
    System.out.println(Arrays.toString(ans));


    System.out.println(arr.size());
    arr.add(45);
    arr.add(68);
    arr.remove(0);
    System.out.println(arr);

    //reverse by built in method
    Collections.reverse(arr);
    System.out.println(arr);

    //reverse
    int i=0,j=arr.size()-1;
    while(i<j){
      int temp= arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
      i++;
      j--;
    }
    System.out.println(arr);

    //Other data types
    ArrayList<Character> brr= new ArrayList<>();
    System.out.println(brr);
  }
}
