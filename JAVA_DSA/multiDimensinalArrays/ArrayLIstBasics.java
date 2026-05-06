package multiDimensinalArrays;
import java.util.ArrayList;
public class ArrayLIstBasics {
  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add(5); a.add(6);
    ArrayList<Integer> b= new ArrayList<>();
    b.add(9); b.add(4);
    ArrayList<ArrayList<Integer>> arr= new ArrayList<>(); //list of rows
    arr.add(a); arr.add(b);
    arr.add(new ArrayList<>()); //empty list
    System.out.println(arr);

    //or using for loop
   for(int i=0;i<arr.size();i++){
      for(int j=0;j<arr.get(i).size();j++){
        System.out.print(arr.get(i).get(j)+" ");
      }
      System.out.println();
    }

    //or using for each loop
    arr.add(new ArrayList<>());
    arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(60);
    for(ArrayList<Integer> list: arr){
      for (int ele: list) {
        System.out.print(ele+" ");
      }
      System.out.println();
    }
  }
}
