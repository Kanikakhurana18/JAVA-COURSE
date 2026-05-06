package multiDimensinalArrays;

import java.util.ArrayList;
import java.util.List;

public class SpirallyTraversedMatrix {
  public static List<Integer> spiralOrder(int[][] arr) {
    //     ArrayList<Integer> ans= new ArrayList<>();
    //     int m=arr.length, n= arr[0].length;
    //     int firstrow=0, lastrow=m-1;
    //     int firstcol=0, lastcol=n-1;
    //     int tne=m*n; //total no. of elements
    //     int l= arr.length;
    //     while(firstrow <= lastrow && firstcol <= lastcol){
    //         //right-col change
    //         for(int j=firstcol;j<=lastcol;j++){
    //             ans.add(arr[firstrow][j]);
    //         }firstrow++;
    //         if(firstrow>lastrow || firstcol> lastcol) break;
    //         //down-row change
    //         for(int i=firstrow;i<=lastrow;i++){
    //             ans.add(arr[i][lastcol]);
    //            }
    //             lastcol--;
    //         if(firstrow>lastrow || firstcol> lastcol) break;
    //         //left-col change
    //         for(int j=lastcol;j>=firstcol;j--){
    //             ans.add(arr[lastrow][j]);
    //             }lastrow--;
    //         if(firstrow>lastrow || firstcol> lastcol) break;
    //         //up-row change
    //         for(int i=lastrow;i>=firstrow;i--){
    //             ans.add(arr[i][firstcol]);
    //         }  firstcol++;
    //     }
    //     return ans;

    //or 
    ArrayList<Integer> ans= new ArrayList<>();
        int m=arr.length, n= arr[0].length;
        int firstrow=0, lastrow=m-1;
        int firstcol=0, lastcol=n-1;
        int tne=m*n; //total no. of elements
        int count=0;
        while(count<tne){
            //right-col change
            for(int j=firstcol;j<=lastcol;j++){
                ans.add(arr[firstrow][j]);
                count++; //important to add count
            }firstrow++;
            if(count==tne) break;
            //down-row change
            for(int i=firstrow;i<=lastrow;i++){
                ans.add(arr[i][lastcol]);
                count++; //important to add count
               }
                lastcol--;
            if(count==tne) break;
            //left-col change
            for(int j=lastcol;j>=firstcol;j--){
                ans.add(arr[lastrow][j]);
                count++; //important to add count
                }lastrow--;
            if(count==tne) break;
            //up-row change
            for(int i=lastrow;i>=firstrow;i--){
                ans.add(arr[i][firstcol]);
                count++; //important to add count
            }  firstcol++;
        }
        return ans;
    }
  public static void main(String[] args) {
    int[][] arr=  {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(spiralOrder(arr));
  }
}
