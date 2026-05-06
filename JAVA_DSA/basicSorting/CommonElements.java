package basicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
  public static void main(String[] args) {
    int[] a={3, 6, 1, 7, 9, 8, 2, 2};
    int[] b={9, 7, 3, 4, 9};
       int i=0;
        int j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans= new ArrayList<>();
        while(i<a.length&& j<b.length){
            if(a[i]==b[j]){
            ans.add(a[i]);
            i++;
            j++;}
            else if(a[i]<b[j]) {
             i++;}
            else{
               j++;//b[j]<a[i] 
            } 
        }
        
        System.out.println(ans);
        
  }
}
