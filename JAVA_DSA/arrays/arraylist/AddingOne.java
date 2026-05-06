package arrays.arraylist;

import java.util.Collections;
import java.util.Vector;

public class AddingOne {
public static void main(String[] args) {
  Vector <Integer> arr=new Vector<>();
  Vector <Integer> ans=new Vector<>();
  arr.add(6);
  arr.add(9);
  int n=arr.size();
  int carry=1;
  for (int i = n-1; i >=0; i--) {
    if(arr.get(i)+carry<=9){
      ans.add(arr.get(i)+carry);
      carry=0;
    }
    else{
      ans.add(0);
      carry=1;
    }
  }
  if(carry==1) ans.add(1);
  Collections.reverse(ans);
  System.out.println(ans);
}
  
}
