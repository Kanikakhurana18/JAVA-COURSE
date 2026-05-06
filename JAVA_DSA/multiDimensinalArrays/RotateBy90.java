package multiDimensinalArrays;

public class RotateBy90 {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,6},{5,8,9,5},{4,6,8,5},{3,5,6,7}};
    print(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){ //first transpose
      for(int j=0;j<i;j++){
        int temp= arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i] = temp;
       }
    }
    for(int i=0;i<arr.length;i++){
      int start=0, end= arr[0].length-1;
      while(start<end){
        int temp= arr[i][start];
        arr[i][start]= arr[i][end];
        arr[i][end]= temp;
        start++;
        end--;
       }
    }
    print(arr);
    System.out.println();
  

  //FOR ANTICLOCKWISE REVERSE EACH COLUMN WISE
     for(int i=0;i<arr.length;i++){ //first transpose
      for(int j=0;j<i;j++){
        int temp= arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i] = temp;
       }
    }
    //for anticlockwise= reverse each row so take j
    for(int j=0;j<arr[0].length;j++){
      int top=0, bottom= arr[0].length-1;
      while(top<bottom){
        int temp= arr[top][j]; //as column j is same as it is
        arr[top][j]= arr[bottom][j];
        arr[bottom][j]= temp;
        top++;
        bottom--;
       }
    }
    print(arr);
  }


  public static void print(int[][] arr){ //2d array =[][] remember
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
}}
