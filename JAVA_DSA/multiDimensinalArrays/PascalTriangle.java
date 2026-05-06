package multiDimensinalArrays;

import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
   public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
          ans.add(new ArrayList<>());
          for(int j=0;j<=i;j++){ //j=i bhi hai as equal wala element missing ho jayega
            if(j==0||j==i) ans.get(i).add(1);
            else{
              int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
              ans.get(i).add(j,val);
            }
          }
      }
       return ans; //outside the Loop
    }
  public static void main(String[] args) {
     int n = 5;
     List<List<Integer>> result = generate(n);  // store result (When you MUST store it
  //Agar function value return kar raha hai (like your generate(n)), aur tumhe us value ka use karna hai (print, process, etc.), to store karna padega:)
     System.out.println(result);               // print it
  }
}
