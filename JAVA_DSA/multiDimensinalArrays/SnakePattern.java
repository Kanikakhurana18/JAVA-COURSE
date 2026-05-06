package multiDimensinalArrays;

public class SnakePattern {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,306},{5,8,869,5},{4,6,98,590},{3,455,6,7}};
    for(int i=0;i<arr.length;i++){
    if(i%2==0){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
    }
    else{
      for(int j=arr[0].length-1;j>=0;j--){
        System.out.print(arr[i][j]+" ");
      }
    }
    System.out.println();
  }
}
}