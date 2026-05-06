package multiDimensinalArrays;

public class RowWithMaxSum {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,3},{5,8,86,5},{4,6,8,100}};
    int maxSum= Integer.MIN_VALUE;
    int row=-1;
    for(int i=0;i<arr.length;i++){
      int sum=0; // reset sum for row wise
      for(int j=0;j<arr[0].length;j++){
        sum+= arr[i][j];
      }
      if(sum>maxSum){
         maxSum=sum;
         row=i; // index 
      }
    }
     System.out.println("Row with maximum sum index is "+ row+ " and sum is "+ maxSum);
  }
}
