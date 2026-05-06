package multiDimensinalArrays;

public class ForEachLoop {
  public static void main(String[] args) {
    int[][] arr={{5,4,3,306},{5,8,869,5},{4,6,987},{908,87}};
    // for(int i=0;i<arr.length;i++){
    //   for (int ele : arr[i]) {
    //     System.out.print(ele+" ");
    //   }
    //   System.out.println();
    // }

    //OR
    for (int[] a : arr) {
      for (int ele : a) { //a = row of array arr
        System.out.print(ele+" ");
      }
      System.out.println();
    }
  }
}
