package multiDimensinalArrays;

public class Transpose { // transpose= colummns to row convert
  public static void main(String[] args) {
    int[][] arr={{5,4,3,6},{5,8,9,5},{4,6,8,5},{3,5,6,7}};
    print(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){  //ONLY FOR SQUARE MATRIX(nxn)
      for(int j=0;j<i;j++){
        int temp = arr[i][j]; //swap elemets
        arr[i][j]= arr[j][i];
        arr[j][i]= temp;
      }
   }
   print(arr); //outside both loops
   System.out.println();

   //FOR RECTANGULAR MATRIX(mxn)
     int[][] matrix = {{1,2,3},{4,5,6}};
     print(matrix);
     System.out.println();
     int m = matrix.length;
     int n = matrix[0].length;
     int[][] ans = new int[n][m];
     for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        print(ans);
 }

  public static void print(int[][] arr){ //2d array =[][] remember
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
