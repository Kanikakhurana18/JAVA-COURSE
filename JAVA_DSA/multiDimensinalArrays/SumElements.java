package multiDimensinalArrays;

public class SumElements {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,3},{5,8,86,5},{4,6,8,9}};
    int sum=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        sum+= arr[i][j];
      }
     }
      System.out.println("Total sum: "+ sum);
 

//ROW WISE SUM PRINT 
for(int i = 0; i < arr.length; i++){
    int rowsum = 0;  // reset here
    for(int j = 0; j < arr[i].length; j++){
        rowsum += arr[i][j];
    }
    System.out.println("Row " + i + " sum: " + rowsum);
  }
 }
}
