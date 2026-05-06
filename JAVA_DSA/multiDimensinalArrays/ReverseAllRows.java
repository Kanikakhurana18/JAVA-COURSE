package multiDimensinalArrays;

public class ReverseAllRows {
  public static void main(String[] args) {
    //Ye actual reverse nahi hai, bas display reverse hai(just printing not array modify)
    int[][] arr={{5,4,3,6},{5,8,9,5},{4,6,8,5},{3,5,6,7}};
     //print
  for (int[] is : arr) {
    for (int ele : is) {
      System.out.print(ele+" ");
    }
    System.out.println();
  }
  System.out.println();

  //REVERSE ALL ROWS ONLY DISPLAY
    for(int i=0;i<arr.length;i++){
      for(int j=arr[i].length-1;j>=0;j--){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();

    //Column-wise reverse print
    //column-wise bottom-to-top print (transpose + column reversal style)
    for(int i = arr.length - 1; i >= 0; i--){ //last row se start kiya hai 
        for(int j = 0; j < arr[i].length; j++){  //column as it is same hai just row change
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
  }
}
