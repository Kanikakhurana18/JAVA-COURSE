package recursion;

import java.util.ArrayList;

public class Strings { //Strings pass vy value
  public static void main(String[] args) {
    // String s="kanika";
    // change(s);
    // System.out.println(s);

    //String Arrays
    // String[] arr = { "Radha", "Krishna" };
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }


    //String Arraylist
    ArrayList<String> al= new ArrayList<>();
    al.add("Ram");
    al.add("Sita");
    System.out.println(al);
    change2(al);
    System.out.println(al);

  }
  //String [Pass by value]
  // public static void change(String s){ 
  //   s="Krishna";
  // }

  //String ArrayList [Pass by reference]
  public static void change2(ArrayList<String> al){
    al.add("Hanuman");
  }
}
