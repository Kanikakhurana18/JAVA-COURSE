package multiDimensinalArrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,306},{5,8,869,5},{4,6,98,590},{3,455,6,7}};
    for(int i=0;i<arr.length;i++){  //REVERSE ALL ROWS = COLUMNS REVERSE
    int left=0; //start
    int right =arr[0].length-1; //end
    while(left<right){
      int temp=arr[i][left];
      arr[i][left]=arr[i][right];
      arr[i][right]=temp;
      left++;
      right--;
    }
  }

  //print
  for (int[] is : arr) {
    for (int ele : is) {
      System.out.print(ele+" ");
    }
    System.out.println();
  }
}
}