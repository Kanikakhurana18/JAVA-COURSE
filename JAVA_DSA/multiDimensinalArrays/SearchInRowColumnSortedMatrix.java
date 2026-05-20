package multiDimensinalArrays;

public class SearchInRowColumnSortedMatrix {
      public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        //TIME COMPLEXITY=O(m+n)=O(n)if is very greater -BETTER
        int i=0, j=m-1; //i= row start, and j=col end
        while(i<n && j>=0){
            if(matrix[i][j]>target) j--;//col left
            else if(matrix[i][j]<target) i++; //row down
            else return true;
        }
        return false;


        //TIME COMPLEXITY=O(mxn)-BRUTE FORCE APPPROACH
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

    }

  public static void main(String[] args) {
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target=25;
    // boolean result = searchMatrix(matrix, target);
    // System.out.println(result);
    System.out.println(searchMatrix(matrix, target));
  }
}
