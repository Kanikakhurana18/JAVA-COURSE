package basicSorting;

import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
      ArrayList<Integer> union= new ArrayList<>();
      int n=a.length;
      int m= b.length;
      int i=0, j=0;
      while(i<n&& j<m){
          if(a[i]<b[j]){ // a smaller-> sorted mai phle aayega
              if(union.isEmpty()|| union.get(union.size()-1)!=a[i]) // agr 
              //empty hai also current and last elemt not same to avoid duplicate.
              union.add(a[i]);  // smallest elemt first as sorted arraylist hai
              i++;
          }
          else if(b[j]<a[i]){ //b smaller-> sorted mai phle aayega
              if(union.isEmpty()|| union.get(union.size()-1)!=b[j]) // agr 
              //empty hai also current and last elemt not same to avoid duplicate.
              union.add(b[j]);  // smallest elemt first as sorted arraylist hai
              j++;
          }
          else {// both equal so koi bhi add kra do i or j
              if(union.isEmpty()|| union.get(union.size()-1)!=a[i]) // agr 
              //empty hai also current and last elemt not same to avoid duplicate.
              union.add(a[i]);  // smallest elemt first as sorted arraylist hai
              i++; j++; 
          }
      }
      // for remaining elements
      while(i<n){
          if(union.isEmpty()|| union.get(union.size()-1)!=a[i])
          union.add(a[i]);
          i++;
      }
      while(j<m){
          if(union.isEmpty()|| union.get(union.size()-1)!=b[j])
          union.add(b[j]);
          j++;
      }
      
      return union; // as arraylist return krni hai
    }


  public static void main(String[] args) {
    int[] a={1,2,2,2,2,3,3,4,9,45};
    int[] b={3,4,6,6,7,8,9,90};
    // System.out.println(findUnion(a, b)); //call function always with parameters

    //or
    ArrayList<Integer> result = findUnion(a, b); //new array list create
    System.out.println(result);
  }


}
