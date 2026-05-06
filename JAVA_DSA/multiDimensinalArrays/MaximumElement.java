package multiDimensinalArrays;

public class MaximumElement {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,3},{5,8,86,5},{4,6,8,9}};
    int max= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      for(int j=0; j<arr[0].length;j++){
         if(arr[i][j]>max) max= arr[i][j];
      }
    }
    System.out.println(max);   //out of loop
  

//ROW WISE MAXIMUM ELEMENT PRINT 
for(int i = 0; i < arr.length; i++){
   int rowmax= Integer.MIN_VALUE;
   for(int j=0; j<arr[0].length;j++){
         if(arr[i][j]>rowmax) rowmax= arr[i][j];
      }
      System.out.println(rowmax);  //in the first for loop
}

}
}